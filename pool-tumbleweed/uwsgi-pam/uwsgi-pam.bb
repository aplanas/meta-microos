SUMMARY = "PAM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for PAM authentication."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-pam-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "92a69aec037307585d8fe5b4b802765eeaf08cb4b1eab16a131d1ce58dfdd3ae218a5b3c27d5bf184094b0bdbe27c928b482978621d72e9ada373b1a7a0d77b6"

RPROVIDES:${PN} += "uwsgi-pam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
uwsgi"

inherit rpm
