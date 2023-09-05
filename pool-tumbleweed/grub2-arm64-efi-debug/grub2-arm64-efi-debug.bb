SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-arm64-efi-debug-2.12~rc1-1.1.noarch.rpm"
RPM_HASH = "d69d51bd31a4be99f743a7feabb328d4e2396c92a0697cf2ecfac01507daf8ea75e03ea588e60d04df16979cf3dd221ff4b8f054095ae58ab0d5d1a20456c3c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
