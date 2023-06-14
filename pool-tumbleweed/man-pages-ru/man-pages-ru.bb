SUMMARY = "Translation of man pages in Russian"
DESCRIPTION = "This package provides translations of man pages in Russian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-ru-4.19.0-1.1.noarch.rpm"
RPM_HASH = "fbaf31a19719e5b4ca58272e20214ca1955fd7193f09fd98365ba3f930a95f9850f6a2335d35013c685f50413c55619ae62555f9013d2a9a5b46240297fb90c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ru \
man-pages-ru"

RDEPENDS:${PN} += "man-pages"

inherit rpm
