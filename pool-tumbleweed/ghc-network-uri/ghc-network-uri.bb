SUMMARY = "URI manipulation"
DESCRIPTION = "This package provides facilities for parsing and unparsing URIs, and creating \
and resolving relative URI references, closely following the URI spec, \
<http://www.ietf.org/rfc/rfc3986.txt IETF RFC 3986>. \
 \
== Backward-compatibility \
 \
In 'network-2.6' the 'Network.URI' module was split off from the 'network' \
package into this package. If you're using the 'Network.URI' module you can be \
backward compatible and automatically get it from the right package by using \
the </package/network-uri-flag network-uri-flag pseudo-package> in your \
'.cabal' file's build-depends (along with dependencies for both 'network-uri' \
and 'network'): \
 \
> build-depends: > network-uri-flag == 0.1.* \
 \
Or you can do the same manually by adding this boilerplate to your '.cabal' \
file: \
 \
> flag network-uri > description: Get Network.URI from the network-uri package \
> default: True > > library > -- ... > if flag(network-uri) > build-depends: \
network-uri >= 2.6, network >= 2.6 > else > build-depends: network-uri < 2.6, \
network < 2.6 \
 \
That is, get the module from either 'network < 2.6' or from 'network-uri >= \
2.6'."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-2.6.4.2-2.6.aarch64.rpm"
RPM_HASH = "0feced2eac4512b7a9d33827e54e4dd554cc31879d743ff88c5c9479702d992774cfc0bcdd4128fe0cefb2fbcb87489650be94409e8905a0cb63ec09fc75ec37"

RPROVIDES:${PN} += "ghc-network-uri \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
