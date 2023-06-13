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

RPM_NAME = "libnetcontrol-devel-0.3.2-1.8.aarch64.rpm"
RPM_HASH = "1142fae576860948a36d9ecebfa0c924a78f9bdde47081517b84ede5507bbc189052218b05101842494ea4559fd0ea802f45428df5a5b887c8b5d125319b0a7d"

RPROVIDES:${PN} += "libnetcontrol-devel \
libnetcontrol-devel(aarch-64) \
pkgconfig(netcontrol)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetcontrol0"

inherit rpm
