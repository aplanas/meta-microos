SUMMARY = "Ukrainian (uk) man pages for guestfs-tools"
DESCRIPTION = "guestfs-tools-man-pages-uk contains Ukrainian (uk) man pages \
for guestfs-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-man-pages-uk-1.50.1-1.1.noarch.rpm"
RPM_HASH = "a47dd9fa8dca8ade4ea881e80c068c683fff7d70c43b25dd0a12fab674686effaf897b86b29feaa3a9f6d21cbdc7910fe4d64631b51f57c574292ea4de76d210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-man-pages-uk"

RDEPENDS:${PN} += "guestfs-tools"

inherit rpm
