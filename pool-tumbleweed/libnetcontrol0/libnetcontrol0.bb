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

RPM_NAME = "libnetcontrol0-0.3.2-2.1.aarch64.rpm"
RPM_HASH = "24dcb2fa2c9fa44006a6ec5b02c4a681b916078182293e13a82ce2d713cfd79a83ef4443081c2ae1fc67809bfbec3ddddaf8c648644427ed2f75c549d1013eff"

RPROVIDES:${PN} += "libnetcontrol.so.0 \
libnetcontrol0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
