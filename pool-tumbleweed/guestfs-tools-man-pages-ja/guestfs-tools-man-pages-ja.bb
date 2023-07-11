SUMMARY = "Japanese (ja) man pages for guestfs-tools"
DESCRIPTION = "guestfs-tools-man-pages-ja contains Japanese (ja) man pages \
for guestfs-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-man-pages-ja-1.50.1-1.2.noarch.rpm"
RPM_HASH = "d825c6c005b32b38b07107458401e966477ab8f2f033c60f67ecb2081988fcba06170c0327e789ba12e40e990b66d028276b12261df11d358c34edf2ddb6bbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-man-pages-ja"

RDEPENDS:${PN} += "guestfs-tools"

inherit rpm
