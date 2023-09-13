SUMMARY = "Translation of man pages in Russian"
DESCRIPTION = "This package provides translations of man pages in Russian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-ru-4.20.0-1.1.noarch.rpm"
RPM_HASH = "5fbc86244ab6bdda6f63ca3908108d7317467609620868ea9259b43d07a159c60837764f374dd30cb67fbf00aff3d43d6c406f6c1bc049ba4728a5e9bbc229a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ru \
man-pages-ru"

RDEPENDS:${PN} += "man-pages"

inherit rpm
