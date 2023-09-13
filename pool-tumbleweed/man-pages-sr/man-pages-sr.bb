SUMMARY = "Translation of man pages in Serbian"
DESCRIPTION = "This package provides translations of man pages in Serbian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-sr-4.20.0-1.1.noarch.rpm"
RPM_HASH = "a998199ea125b01a4ae8fb43c70a8fad38e5b7b71f7de83d240483aeafcc9f51784aba31eae53a2d2ef016e9073237c027edd5e4930f43f220f1eaaec53f92de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-sr \
man-pages-sr"

RDEPENDS:${PN} += "man-pages"

inherit rpm
