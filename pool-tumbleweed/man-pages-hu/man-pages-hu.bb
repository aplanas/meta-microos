SUMMARY = "Translation of man pages in Hungarian"
DESCRIPTION = "This package provides translations of man pages in Hungarian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-hu-4.20.0-1.1.noarch.rpm"
RPM_HASH = "1a22b8954fbc9786726162eaa5de04bac632040cc0c40e1590359ae9324d1b4d895058f69c15493207feb9d72f6cda73e105ee0aff60428d76c9717260089b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-hu \
man-pages-hu"

RDEPENDS:${PN} += "man-pages"

inherit rpm
