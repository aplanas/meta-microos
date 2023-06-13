SUMMARY = "Dependencies to build ghc"
DESCRIPTION = "Prebuild alex and happy for bootstrapping the proper ghc build. \
Don't use outside of GHC bootstrapping!"
LICENSE = "BSD-3-Clause & BSD-2-Clause"

PV = "1.3"

RPM_NAME = "ghc-bootstrap-helpers-1.3-1.1.aarch64.rpm"
RPM_HASH = "ddb18531835cbe829403e7a1c93cd8b6ce37c44df8af2d61548d374fda9441490ad5758484bce6a864955036dfb406afced7dbf105f2164d8e36e8e97ea6dc32"

RPROVIDES:${PN} += "ghc-bootstrap-helpers \
ghc-bootstrap-helpers(aarch-64)"

RDEPENDS:${PN} += "libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
this-is-only-for-build-envs"

inherit rpm
