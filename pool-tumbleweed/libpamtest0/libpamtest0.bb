SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "If you plan to test a PAM module, you can use this library, which simplifies \
testing of modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "libpamtest0-1.1.4-2.3.aarch64.rpm"
RPM_HASH = "1c9a2bdac288d5e85eab2388a750405fe5da938464ec22f7cb73a7d53326b5cc3952cfd5c798b0f733b6b9d15389790b2ee7ee8efe1f5b56613e28e3202ef8ed"

RPROVIDES:${PN} += "libpamtest.so.0()(64bit) \
libpamtest0 \
libpamtest0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
pam_wrapper"

inherit rpm
