SUMMARY = "Plugin libffi for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for libffi."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-libffi-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "e2bce7352bb9046ff4008477395c5e1b3c4da28c563462bd5873039f9e897148a9610e0839bb7a88eedb158178fcf61fef33371cd19392b1258aab96fa61c56d"

RPROVIDES:${PN} += "libffi-plugin.so \
uwsgi-libffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
uwsgi"

inherit rpm
