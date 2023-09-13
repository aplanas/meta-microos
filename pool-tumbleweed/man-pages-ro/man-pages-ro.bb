SUMMARY = "Translation of man pages in Romanian"
DESCRIPTION = "This package provides translations of man pages in Romanian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-ro-4.20.0-1.1.noarch.rpm"
RPM_HASH = "10ef5d0d9fe5ecb02e29db8913011bc9cfa5fadae6366ef0696d4de7103a1c1c1fe8d3c9db0353b2bb69150d8a425a081e44b1e167c31211e4ff7bb01bdb817d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ro \
man-pages-ro"

RDEPENDS:${PN} += "man-pages"

inherit rpm
