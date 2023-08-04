SUMMARY = "Plasma branding for GRUB2's graphical console"
DESCRIPTION = "Plasma branding for the GRUB2's graphical console."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "grub2-theme-breeze-5.27.7-1.1.noarch.rpm"
RPM_HASH = "93a12a5cd63a1e68682508007eacfd551683fa0039bf61c75a54ffbd183fcfd96200ad6babca0e3bc98cbcc15a1db7767868134867e8f97dbbd953a72b272e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-theme-breeze"

RDEPENDS:${PN} += ""

inherit rpm
