SUMMARY = "Haskell cpphs library"
DESCRIPTION = "This package provides the Haskell cpphs shared library."
LICENSE = "LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-1.20.9.1-5.3.aarch64.rpm"
RPM_HASH = "eb79fb43a393cf6a950ae9636f06d874e82151b22dd6ead563fac89ce7758470b41e7ed2261cc0dfdd190ccad521e03c51bbe16aa4c7c98c80d27737f2a006b0"

RPROVIDES:${PN} += "ghc-cpphs \
ghc-cpphs(aarch-64) \
libHScpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpolyparse-1.13-E8FdqtcSqxM3P2njDFrYm8-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
