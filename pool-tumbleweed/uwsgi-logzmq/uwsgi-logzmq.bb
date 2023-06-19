SUMMARY = "ZMQ Logger for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for ZMQ logging."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-logzmq-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "aee49b658beddb54b9b4d5b8a818b4a80171080e13a844b8b662fb8d8143c80c98425882034b0948282d0cd8c2cc7cfa47730db5c3cb926692585f347dcace4f"

RPROVIDES:${PN} += "uwsgi-logzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
