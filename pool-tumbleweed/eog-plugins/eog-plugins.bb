SUMMARY = "A collection of plugins for Eye of GNOME"
DESCRIPTION = "This package contains plugins for additional features in Eye of GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugins-44.0-1.1.aarch64.rpm"
RPM_HASH = "3bda64e615b6ef0be60317ca05007c089ef329ee8b4fb100f19fa9ebfe1f804c37ee7f9baa26a527152558d6d2100a96424459e1168204c3d57b919ebbe37c14"

RPROVIDES:${PN} += "eog-plugins \
eog-plugins(aarch-64)"
RDEPENDS:${PN} += "eog"

inherit rpm
