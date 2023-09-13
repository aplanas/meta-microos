SUMMARY = "Translation of man pages in Indonesian"
DESCRIPTION = "This package provides translations of man pages in Indonesian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-id-4.20.0-1.1.noarch.rpm"
RPM_HASH = "54349e352daaee975b749266357b8ad54550a6a282b384a70d593771ba1d5478b7a5b9d5a7a41f52a11e453a95f9f4a44510a77287e8743e007dc84b7b4d6954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-id \
man-pages-id"

RDEPENDS:${PN} += "man-pages"

inherit rpm
