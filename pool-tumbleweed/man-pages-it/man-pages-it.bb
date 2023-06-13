SUMMARY = "Translation of man pages in Italian"
DESCRIPTION = "This package provides translations of man pages in Italian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-it-4.19.0-1.1.noarch.rpm"
RPM_HASH = "2673a4fd3e16595447349832d82b3cc6a3a6094e97fc03d817d4b8f8a04695e7efe1fed4be1434409e6717030b96802b9eb80c11066e688fbba09635f9ae9ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:it) \
man-pages-it"

RDEPENDS:${PN} += "man-pages"

inherit rpm
