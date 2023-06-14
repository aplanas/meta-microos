SUMMARY = "POSIX network database (<netdb.h>) API"
DESCRIPTION = "This package provides Haskell bindings to the the [POSIX network database \
(netdb.h) \
API](http://pubs.opengroup.org/onlinepubs/009696699/basedefs/netdb.h.html). \
 \
=== Relationship to the 'network' package \
 \
The 'network' package version 2.* series provides 'Network.BSD' but it is \
removed starting with 'network' version 3.0. \
 \
This package provides the 'Network.BSD' module split off from the \
<https://hackage.haskell.org/package/network network package>. \
 \
If in addition to the 'network''s modules also 'Network.BSD' is necessary, add \
'network-bsd' to your dependencies like so: \
 \
> library > build-depends: network >= 2.7 && < 3.2 > , network-bsd >= 2.7 && < \
2.9 \
 \
I.e. you can control the version of the 'network' package independently. \
 \
__NOTE__: Starting with 'network-bsd-2.8.1.0' the APIs of 'network' and \
'network-bsd' evolve differently, and consequently the versioning doesn't match \
up anymore! Moreover, also starting with version 'network-bsd-2.8.1.0' this \
package requires 'network >= 3' in order to avoid module name clashes with \
'network < 3''s 'Network.BSD' module. \
 \
However, 'network-bsd-2.7.0.0' and 'network-bsd-2.8.0.0' passes thru the \
'Network.BSD' module from 'network-2.7.*' and 'network-2.8.*' respectively in a \
non-clashing way via Cabal's \
<https://www.haskell.org/cabal/users-guide/developing-packages.html#pkg-field-library-reexported-modules \
reexported-modules> feature while ensuring a well-defined \
<https://pvp.haskell.org/ API versioning> of the observable API of \
'network-bsd'. This is why the example above supporting a wide range of \
'network' versions works by including version 2.7.0.0 in the required version \
range of 'network-bsd'."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-2.8.1.0-7.2.aarch64.rpm"
RPM_HASH = "7724bde2704a2fa9f54220037bec7f37d020e6c5af393bb30031739a2d839edc797d936fd9ef30cd0d9f53271500006f1ced12b643a7941d17a8b7eb9c73dbe9"

RPROVIDES:${PN} += "ghc-network-bsd \
libHSnetwork-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
