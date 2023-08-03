SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-debug-2.06-54.1.noarch.rpm"
RPM_HASH = "218369628657e079037cafda9e5123230da4dd71cc79f7cfaf7a92c29817792f863b23c274779fa557366a3df27a1019d76bf5fd69db1748696df3ac5331f119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
