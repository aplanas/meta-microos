SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-debug-2.06-55.1.noarch.rpm"
RPM_HASH = "5b487f4e576204fa0efb973e6733b3f96cecfae3db690c61bdca86b14df2940aef1f1fc66806919c51f0944fb8d29c46a1c71b94b10b39972162c4b675272d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
