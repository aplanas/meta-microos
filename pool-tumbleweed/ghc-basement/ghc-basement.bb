SUMMARY = "Foundation scrap box of array & string"
DESCRIPTION = "Foundation most basic primitives without any dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.0.15"

RPM_NAME = "ghc-basement-0.0.15-2.3.aarch64.rpm"
RPM_HASH = "aec154b78acb964563d2ce0daaab1ee38075abc239988dc310cc4ed8a787d9a628ffe0ad490723529fc50fb9ada287b0b4b151c7f8c3b9dd6f44dae48c46df5f"

RPROVIDES:${PN} += "ghc-basement \
ghc-basement(aarch-64) \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
