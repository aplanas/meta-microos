SUMMARY = "Development files for the Panel indicator applet (GTK+2 variant)"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator-devel-16.10.0+bzr20171205-4.16.aarch64.rpm"
RPM_HASH = "a174b3dc5ef64e26602aff6d60d82c97c60619a6e1598bee78337219e943be1ff32265cf7d8fb241935fa38591d9993ac51f74e51cf60fe46f4e1b909f8e6918"

RPROVIDES:${PN} += "libindicator-devel \
pkgconfig-indicator-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libindicator7 \
pkgconfig-gtk+-2.0"

inherit rpm
