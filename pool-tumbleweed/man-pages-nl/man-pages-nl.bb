SUMMARY = "Translation of man pages in Dutch"
DESCRIPTION = "This package provides translations of man pages in Dutch."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-nl-4.19.0-1.1.noarch.rpm"
RPM_HASH = "4d0384c8b5c2dde587646320aace32b52f76045a10d33f2ed55886bc94ff68481bac27b04d8edcd75c496790ca296c306443151b78cf5848a7281ce88cc45d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:nl) \
man-pages-nl"

RDEPENDS:${PN} += "man-pages"

inherit rpm
