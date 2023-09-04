SUMMARY = "Japanese (ja) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-ja contains Japanese (ja) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-ja-1.50.1-4.2.noarch.rpm"
RPM_HASH = "4bdc0a92d3ecd806e6f0fa91db2a6963acabdde94c748752973679e4caaf27fe5825b78733da642136d158a0144724af490ca900944430ee5397faa39e60505c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-ja"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
