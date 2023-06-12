SUMMARY = "Utility library for AppArmor"
DESCRIPTION = "This package provides the libapparmor library, which contains the \
change_hat(2) symbol, used for sub-process confinement by AppArmor, as \
well as functions to parse AppArmor log messages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "libapparmor1-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "ed9d8d87a2762ea703d2bd1b8723a0733374898d12e9f3d9425b703a1be4197f8e906af873849d282a1e7920313d5e4c82c0cc5c4e73df8e275585f81dbb6fa9"

RPROVIDES:${PN} += "libapparmor \
libapparmor.so.1()(64bit) \
libapparmor.so.1(APPARMOR_1.0)(64bit) \
libapparmor.so.1(APPARMOR_1.1)(64bit) \
libapparmor.so.1(APPARMOR_2.10)(64bit) \
libapparmor.so.1(APPARMOR_2.11)(64bit) \
libapparmor.so.1(APPARMOR_2.13)(64bit) \
libapparmor.so.1(APPARMOR_2.13.1)(64bit) \
libapparmor.so.1(APPARMOR_2.9)(64bit) \
libapparmor.so.1(APPARMOR_3.0)(64bit) \
libapparmor.so.1(IMMUNIX_1.0)(64bit) \
libapparmor.so.1(PRIVATE)(64bit) \
libapparmor1 \
libapparmor1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
