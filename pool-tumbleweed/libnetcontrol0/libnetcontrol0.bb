SUMMARY = "A network configuration library"
DESCRIPTION = "A interim network configuration library, currently implementing the \
libnetcf interface for libvirt. \
 \
The libnetcontrol0 package provides the shared library. \
 \
 \
 \
Authors: \
-------- \
    Olaf Kirch <okir@suse.de> \
    Marius Tomaschewski <mt@suse.de>"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libnetcontrol0-0.3.2-1.9.aarch64.rpm"
RPM_HASH = "0505864c8222e0805cf43247a63882ea3a88a9e43d716f819ad48081cc07200e1f09f994b527e859aa444d3874a6b0b292d03665f8d96cc9de96ea154dc6f40c"

RPROVIDES:${PN} += "libnetcontrol.so.0 \
libnetcontrol0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
