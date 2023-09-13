SUMMARY = "Translation of man pages in Danish"
DESCRIPTION = "This package provides translations of man pages in Danish."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-da-4.20.0-1.1.noarch.rpm"
RPM_HASH = "ff8b52b618f073fb1ce7e41d7ebb96f0e6ddd76b6b300287ba8d3fa4261c60e13ece0fc9b426c1b91cadcfab4621dfbb1dd35a8d9fbe3f5f66082cc62e400114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-da \
man-pages-da"

RDEPENDS:${PN} += "man-pages"

inherit rpm
