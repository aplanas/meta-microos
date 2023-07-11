SUMMARY = "Plugin libffi for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for libffi."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-libffi-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "683fc35ba3d29e587286db2cb081e1a60f80879c2a4996ffc49d869c58f00d05fd659db5fbb2320a114e07b1f8e4858bd6756ec2611b39af7465296b3235e65c"

RPROVIDES:${PN} += "libffi-plugin.so \
uwsgi-libffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
uwsgi"

inherit rpm
