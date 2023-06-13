SUMMARY = "Command line interface for libeconf"
DESCRIPTION = "This package contains tools for handling configuration files in e.g. /usr/etc \
and /etc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libeconf-utils-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "acd26d170115481904744aa269a1c8546d0f26ca685f70bf5e99ed0c7b7aa93616b5a325407e80af16e197e6c7e1189c463c1a05f6d7147729c16275d2b510ee"

RPROVIDES:${PN} += "libeconf-utils \
libeconf-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libeconf.so.0()(64bit) \
libeconf.so.0(LIBECONF_ALPHA)(64bit) \
libeconf0"

inherit rpm
