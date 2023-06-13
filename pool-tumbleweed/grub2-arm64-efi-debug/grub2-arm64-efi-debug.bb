SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-debug-2.06-53.1.noarch.rpm"
RPM_HASH = "6283b033143d614db76eb21e5550f41194ed75ce424f3a238214892d3e5cf9c926fc04b50b8e0b4f13e3778bc181c46666109fe501e7b4012742206553689e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
