SUMMARY = "Ukrainian (uk) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-uk contains Ukrainian (uk) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-uk-1.50.1-3.3.noarch.rpm"
RPM_HASH = "9cd3596e97af189e8474b921b328aedcb6390f986d0e71f0fa9afd8e7f39ca8b0e71e4f4a6ad47a1c6d8aa3cfc2cad7b77fbae14faa8424f390bd9fc260e1eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-uk"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
