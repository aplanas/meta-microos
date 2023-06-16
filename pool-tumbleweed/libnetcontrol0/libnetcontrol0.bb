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

RPM_NAME = "libnetcontrol0-0.3.2-1.8.aarch64.rpm"
RPM_HASH = "fc244fd0f523f7a3e05da500a6df8e5c79d5c6f5fc8e52a4095a93ef225b718d8b15438fd990dc9de0f5032bb47b29163946fa7b404f7dda1132dcfef7927898"

RPROVIDES:${PN} += "libnetcontrol.so.0 \
libnetcontrol0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
