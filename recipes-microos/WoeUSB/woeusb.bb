SUMMARY = "Windows USB installation media creator"
DESCRIPTION = "WoeUSB is a utility for creating a bootable Windows installation \
USB storage device from an existing Windows installation disc or disk image."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.4"

RPM_NAME = "WoeUSB-5.2.4-1.6.noarch.rpm"
RPM_HASH = "eb11b585ea9bfbe7ad0ca57dbf6fdb566d013c29a2c6d3666af57b01081a09b6e53433a44f7174d8b3124b27691e42056ddabe673cad44c4016baf3e51e36283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WoeUSB"
RDEPENDS:${PN} += "/usr/bin/bash bash dosfstools findutils gawk grep grub2 ntfsprogs parted util-linux wget wimtools"

inherit rpm
