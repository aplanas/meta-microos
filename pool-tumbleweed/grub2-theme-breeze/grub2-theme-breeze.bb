SUMMARY = "Plasma branding for GRUB2's graphical console"
DESCRIPTION = "Plasma branding for the GRUB2's graphical console."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "grub2-theme-breeze-5.27.6-1.1.noarch.rpm"
RPM_HASH = "de3535018d62e00d7637eacfe252b82c1a058636de71b9557eb8fcba8cd206dacedf4af28f6754fad5053082c17b096472b53177a6a3d294e24e272b19f17b1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-theme-breeze"

RDEPENDS:${PN} += ""

inherit rpm
