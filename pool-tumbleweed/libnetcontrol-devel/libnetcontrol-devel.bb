SUMMARY = "Development header and library files"
DESCRIPTION = "A interim network configuration library, currently implementing the \
libnetcf interface for libvirt. \
 \
The libnetcontrol-devel package contains libraries and header files \
required for development. \
 \
 \
 \
Authors: \
-------- \
    Olaf Kirch <okir@suse.de> \
    Marius Tomaschewski <mt@suse.de>"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libnetcontrol-devel-0.3.2-2.1.aarch64.rpm"
RPM_HASH = "53f46b7588fee72feb6e6565a466130b834d1b69bef8a5fac04cc7f5dec39fae55da267598d8495b72d4ed21db6d7ad4d976a90cae8c214c1dccf5cb061f56ff"

RPROVIDES:${PN} += "libnetcontrol-devel \
pkgconfig-netcontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetcontrol0"

inherit rpm
