SUMMARY = "PAM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for PAM authentication."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-pam-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "86fb140acdb805772891c0c4794094bef04e7123c872d1d035ccb09d02c6467c11ed126d0307afbe24df289839a3879242651df885980795056bed0d2caf3efa"

RPROVIDES:${PN} += "uwsgi-pam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
uwsgi"

inherit rpm
