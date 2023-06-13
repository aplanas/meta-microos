SUMMARY = "Translation of man pages in Hungarian"
DESCRIPTION = "This package provides translations of man pages in Hungarian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-hu-4.19.0-1.1.noarch.rpm"
RPM_HASH = "3df693563b36f1bc39e17549951858d8c33b769577c452a22fd86cb53dc5aaf6ad54691f0eadc88fe9dc6116896f8f4a03a027c15331d3739d1a11c1249d01c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:hu) \
man-pages-hu"

RDEPENDS:${PN} += "man-pages"

inherit rpm
