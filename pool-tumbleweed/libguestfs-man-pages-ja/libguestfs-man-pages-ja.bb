SUMMARY = "Japanese (ja) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-ja contains Japanese (ja) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-ja-1.50.1-3.1.noarch.rpm"
RPM_HASH = "d5ab52f28601c9e9ac7118ce20e4b2fad548008d59c3a890dd076535fe4afd0bc9e9ba58938116d917aae75f873b829fac6a5b897c50c75c96f83fff96041003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-ja"
RDEPENDS:${PN} += "libguestfs"

inherit rpm
