SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-arm64-efi-debug-2.06-53.3.noarch.rpm"
RPM_HASH = "abece072648dd878997db936739219f135dd4e9dbb8f0e5f5bd54f5785085502adaaff6795115ba861f84d6d7517912714b68f7bdf03a9a96b98ae1d3fd6e7a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
