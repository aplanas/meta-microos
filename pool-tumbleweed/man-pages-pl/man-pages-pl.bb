SUMMARY = "Translation of man pages in Polish"
DESCRIPTION = "This package provides translations of man pages in Polish."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-pl-4.20.0-1.1.noarch.rpm"
RPM_HASH = "7a0cea2059df1a6d9a0b1742d24c9ffda2fd9fb296067c7f945f0cc94d44630662b61e555e9139fbf5552879f0bd33249ee43c20db3da3350270f5e92f674359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-pl \
man-pages-pl"

RDEPENDS:${PN} += "man-pages"

inherit rpm
