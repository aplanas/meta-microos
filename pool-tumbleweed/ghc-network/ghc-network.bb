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

PV = "3.1.4.0"

RPM_NAME = "ghc-network-3.1.4.0-1.3.aarch64.rpm"
RPM_HASH = "3a0ccbaeb7a3e9048824339df1249fbf25bf40df5205b7834fdd5e8e74d1317ab0f7bd1944aafe99c8c1a19134d938d7a883c89b464db15248d1facb57d18430"

RPROVIDES:${PN} += "ghc-network \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
