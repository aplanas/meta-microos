SUMMARY = "Development package for libgpg-error"
DESCRIPTION = "Files needed for software development using libgpg-error."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.47"

RPM_NAME = "libgpg-error-devel-1.47-1.1.aarch64.rpm"
RPM_HASH = "72ca226c230c127855c685574280b413d6eae34788e8aaacf44cb5c8a2b23b44f6a0cbe3e2c0d20c44d6c67e3a734fb5b99036c56d3e9f2cb8d179a49f00074d"

RPROVIDES:${PN} += "libgpg-error-devel \
libgpg-error-devel(aarch-64) \
pkgconfig(gpg-error)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
info \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
libgpg-error0"

inherit rpm