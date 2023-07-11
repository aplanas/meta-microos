SUMMARY = "Development environment for Gutenprint"
DESCRIPTION = "The development environment for the Gutenprint printer drivers. \
See the developers guide to Gutenprint at /usr/share/gutenprint/doc/gutenprint.pdf"
LICENSE = "GPL-2.0-or-later"

PV = "5.3.4"

RPM_NAME = "gutenprint-devel-5.3.4-1.2.aarch64.rpm"
RPM_HASH = "ee5f2a59d3b3455a13b5a7a6f0f958b3958188ef0a3c9ee02fdc4e656673787f973b532eda35c8ea40029a29b0f561449943145a83ba83d098770e3f77ba07f0"

RPROVIDES:${PN} += "gutenprint-devel \
pkgconfig-gutenprint \
pkgconfig-gutenprintui2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups \
ghostscript-library \
glibc-devel \
gtk2-devel \
gutenprint \
pkgconfig-gtk+-2.0 \
pkgconfig-gutenprint"

inherit rpm
