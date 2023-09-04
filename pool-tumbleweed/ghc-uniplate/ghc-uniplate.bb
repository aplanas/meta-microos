SUMMARY = "Help writing simple, concise and fast generic operations"
DESCRIPTION = "Uniplate is library for writing simple and concise generic operations. \
Uniplate has similar goals to the original Scrap Your Boilerplate work, but is \
substantially simpler and faster. \
 \
To get started with Uniplate you should import one of the three following \
modules: \
 \
* 'Data.Generics.Uniplate.Data' - to quickly start writing generic functions. \
Most users should start by importing this module. \
 \
* 'Data.Generics.Uniplate.Direct' - a replacement for \
'Data.Generics.Uniplate.Data' with substantially higher performance (around 5 \
times), but requires writing instance declarations. \
 \
* 'Data.Generics.Uniplate.Operations' - definitions of all the operations \
defined by Uniplate. Both the above two modules re-export this module. \
 \
In addition, some users may want to make use of the following modules: \
 \
* 'Data.Generics.Uniplate.Zipper' - a zipper built on top of Uniplate \
instances. \
 \
* 'Data.Generics.SYB' - users transitioning from the Scrap Your Boilerplate \
library. \
 \
* 'Data.Generics.Compos' - users transitioning from the Compos library. \
 \
* 'Data.Generics.Uniplate.DataOnly' - users making use of both 'Data' and \
'Direct' to avoid getting instance conflicts."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-1.6.13-4.10.aarch64.rpm"
RPM_HASH = "312b7af1f064c8f5b1a1a0134d2ea88bd6de35062357ce5389ea8a767a6cf9f5b6e2dce5045a1d408c231cc95e5ab6913eef6253b268a730c15d2d86af1a901b"

RPROVIDES:${PN} += "ghc-uniplate \
libHSuniplate-1.6.13-EEjCQACslljIQmS3K29CqX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsyb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
