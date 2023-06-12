SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-branding-upstream-2.06-53.1.aarch64.rpm"
RPM_HASH = "636ebb90d3d90299b7c3237f17a3ab1cffb8daef73e7d497bf97005961fa2e7a0583d53b75eefcf2af28921e7d580b3aa2e0b3f33691deaa05eb9d505243c3c4"

RPROVIDES:${PN} += "grub2-branding-upstream \
grub2-branding-upstream(aarch-64)"
RDEPENDS:${PN} += "grub2"

inherit rpm
