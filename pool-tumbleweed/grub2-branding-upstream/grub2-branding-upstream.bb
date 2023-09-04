SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-branding-upstream-2.06-55.1.aarch64.rpm"
RPM_HASH = "d1f43541f865e6d8808c9b6a64d0df41cfbf2ac89187b5e56515581d590e6072396c10c430711652644c1d97e4d990bead465a8743ac34ebbf14016a74ff7710"

RPROVIDES:${PN} += "grub2-branding-upstream"

RDEPENDS:${PN} += "grub2"

inherit rpm
