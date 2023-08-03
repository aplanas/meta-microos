SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-branding-upstream-2.06-54.1.aarch64.rpm"
RPM_HASH = "36c555cab90bc15703a790f0fb0d0bab690d755141b72e12a3263dd9597133c0048e6bdb546661ef563e188a1b930e33e44fe5263034e56c443768f25eac3bb8"

RPROVIDES:${PN} += "grub2-branding-upstream"

RDEPENDS:${PN} += "grub2"

inherit rpm
