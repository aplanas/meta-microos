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

RPM_NAME = "libnetcontrol-devel-0.3.2-1.9.aarch64.rpm"
RPM_HASH = "fde8c6aa56bc880efb70258143c993c0a9591867e4e9cec9e6b7d4dd99213e35ddccbc60dfa4e6c8ee5771da548be57411615ae27c3384128dfe54bf906ae165"

RPROVIDES:${PN} += "libnetcontrol-devel \
pkgconfig-netcontrol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetcontrol0"

inherit rpm
