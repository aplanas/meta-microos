SUMMARY = "Development package for irssi"
DESCRIPTION = "This package contains the development files for irssi. It allows to \
compile plugins for the irssi package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "irssi-devel-1.4.4-3.1.aarch64.rpm"
RPM_HASH = "f521eeb9bb0ea0cd0cfb9e5a8c691af8a2a0e77121fd538cd6c027ba8958f03b8a1e4995bb0979e0ab232a77fb59ddd362798959627787175ca86f9d6c84f061"

RPROVIDES:${PN} += "irssi-devel \
pkgconfig-irssi-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dante-devel \
irssi \
pkgconfig-glib-2.0"

inherit rpm
