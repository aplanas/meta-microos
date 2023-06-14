SUMMARY = "uWSGI Module for Apache 2.0"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an Apache 2.0 module for uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "apache2-mod_uwsgi-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "9a625bcbae8a250b3eab398d88acc74ce06d9356f03540e1fd925303a9df4b82e68cad951e8c6b46b1029cd2ca1689eb9afec7d09c57aa6ded5a65856004f67c"

RPROVIDES:${PN} += "apache2-mod-uwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
