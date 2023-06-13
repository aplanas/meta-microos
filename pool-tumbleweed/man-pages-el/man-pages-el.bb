SUMMARY = "Translation of man pages in Greek"
DESCRIPTION = "This package provides translations of man pages in Greek."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-el-4.19.0-1.1.noarch.rpm"
RPM_HASH = "e2be2518d9282e13083582c77848df3feaf1bddf798c3c2f18604a36a52fe0dd8858c37635aab1e60b089c38482cab1b50c670811fba9e7c9311db672b1ae64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:el) \
man-pages-el"

RDEPENDS:${PN} += "man-pages"

inherit rpm
