SUMMARY = "Translation of man pages in French"
DESCRIPTION = "This package provides translations of man pages in French."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-fr-4.20.0-1.1.noarch.rpm"
RPM_HASH = "f0d9531a89fb49c452de736aabb5127b7f75c7a4a5b1f9df03f71dea27cc0810fff9979c61dd314eda375f6af8a438a215556317bd3f6b202ed6176c6720f531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-fr \
man-pages-fr"

RDEPENDS:${PN} += "man-pages"

inherit rpm
