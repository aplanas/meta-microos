SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss12-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "527206d691148ba533aa6be5340f13fb92bfe62f6bad7bc0ab34aa37ec2c1b75de863d1d3545643320f357a62421f99178db5dbd7a9bb2c57df498f89375ff7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
