SUMMARY = "PAM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for PAM authentication."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-pam-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "816400602e5fa8f094e4335829f6320b88026af48b258907f09c31b29d1a211949beb44da50561d3b38c616fa5d07bd72aa914549d3e5718328e2a0d0e140a06"

RPROVIDES:${PN} += "uwsgi-pam \
uwsgi-pam(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
uwsgi"

inherit rpm
