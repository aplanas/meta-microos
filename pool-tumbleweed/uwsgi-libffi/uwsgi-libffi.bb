SUMMARY = "Plugin libffi for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for libffi."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-libffi-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "bb505b54f735ee65b04117c0534c1445b92da0e81536e25f8bd5e2027735045c438c996b360b4785e74548e360b11a26144a4f471af83a4f9d12dc00819971b6"

RPROVIDES:${PN} += "libffi-plugin.so \
uwsgi-libffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
uwsgi"

inherit rpm
