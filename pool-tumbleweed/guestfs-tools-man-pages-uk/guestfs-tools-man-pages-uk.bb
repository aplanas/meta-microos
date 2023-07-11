SUMMARY = "Ukrainian (uk) man pages for guestfs-tools"
DESCRIPTION = "guestfs-tools-man-pages-uk contains Ukrainian (uk) man pages \
for guestfs-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "guestfs-tools-man-pages-uk-1.50.1-1.2.noarch.rpm"
RPM_HASH = "e544a3b3e39daf5f63ddb8cd92790ed093e7244a57977aae761f68e98add2ae18519de3255c3de6d44db896e4887a11e76fa8d3355bffb228fcd515ed61507e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-man-pages-uk"

RDEPENDS:${PN} += "guestfs-tools"

inherit rpm
