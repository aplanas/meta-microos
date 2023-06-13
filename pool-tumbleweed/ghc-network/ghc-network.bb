SUMMARY = "Low-level networking interface"
DESCRIPTION = "This package provides a low-level networking interface. \
 \
=== High-Level Packages Other packages provide higher level interfaces: \
 \
* connection * hookup * network-simple \
 \
=== Extended Packages 'network' seeks to provide a cross-platform core for \
networking. As such some APIs live in extended libraries. Packages in the \
'network' ecosystem are often prefixed with 'network-'. \
 \
==== 'network-bsd' In 'network-3.0.0.0' the 'Network.BSD' module was split off \
into its own package, 'network-bsd-3.0.0.0'. \
 \
==== 'network-uri' In 'network-2.6' the 'Network.URI' module was split off into \
its own package, 'network-uri-2.6'. If you're using the 'Network.URI' module \
you can automatically get it from the right package by adding this to your \
'.cabal' file: \
 \
> library > build-depends: network-uri-flag."
LICENSE = "BSD-3-Clause"

PV = "3.1.2.8"

RPM_NAME = "ghc-network-3.1.2.8-1.3.aarch64.rpm"
RPM_HASH = "f2757f34f3272e02611f5e8a57b0e7fb979f02b2d96a191072f8478f6da5962eb7eb986281c84c08f45f3f8d08fb19f62dd6614cf46191bc83699ba4c72c42a4"

RPROVIDES:${PN} += "ghc-network \
ghc-network(aarch-64) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
