SUMMARY = "Japanese (ja) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-ja contains Japanese (ja) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-ja-1.50.1-3.3.noarch.rpm"
RPM_HASH = "57ab72cf6517b5efca9cb194f842cd52bf3ad1af0a1c342436857c06424a0fcdbf772142fbad8fff116633225d70c8c84d994b9aa34e04c2131d00ecff4b524f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-ja"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
