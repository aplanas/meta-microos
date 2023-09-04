SUMMARY = "Ukrainian (uk) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-uk contains Ukrainian (uk) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-uk-1.50.1-4.2.noarch.rpm"
RPM_HASH = "01578aa8c1b1fbe3e01f314257397da12abe71bbdda50da61ddeefeea52891b3aca023abdfe4202850f56e7a0c35bd9509200d4ea202fb0ded062471fc27ad50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-uk"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
