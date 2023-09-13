SUMMARY = "Translation of man pages in Ukrainian"
DESCRIPTION = "This package provides translations of man pages in Ukrainian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-uk-4.20.0-1.1.noarch.rpm"
RPM_HASH = "4fe22dce2694a201b69201597f867b6a81de25c1a8c1ee41731138604d8dfd326784b26f84ab01589c29c83177ac397ac083f7a0e1e8826550fc77b57a732443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-uk \
man-pages-uk"

RDEPENDS:${PN} += "man-pages"

inherit rpm
