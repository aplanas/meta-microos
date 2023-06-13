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

RPM_NAME = "ghc-uniplate-1.6.13-4.3.aarch64.rpm"
RPM_HASH = "5fedd656ac18d8e59a91293c74c8623ebe6990d3f8b42c9e39a25c1c7030d860a19a45ca35c1868800ef2ebc6364db11ca70d080aaea852cf402a9b3949834a0"

RPROVIDES:${PN} += "ghc-uniplate \
ghc-uniplate(aarch-64) \
libHSuniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
