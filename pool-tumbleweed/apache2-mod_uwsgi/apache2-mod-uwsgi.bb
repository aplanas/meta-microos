SUMMARY = "uWSGI Module for Apache 2.0"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an Apache 2.0 module for uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "apache2-mod_uwsgi-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "1d5dff75efdc05b451cb9b3b64201b34004cd23e1ec674e67d552895e95e019702a05fbe94e5afcded9930995ab9b2f2071fcbc523a01349bd408bf183290d63"

RPROVIDES:${PN} += "apache2-mod-uwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
