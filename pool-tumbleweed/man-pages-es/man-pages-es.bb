SUMMARY = "Translation of man pages in Spanish"
DESCRIPTION = "This package provides translations of man pages in Spanish."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-es-4.19.0-1.1.noarch.rpm"
RPM_HASH = "c21ccf681ece7cf9ea2cbe040485fe25f796285fd2d892876d94886abe6bc50b8f0e8558b090e6cf3d8cfe8a4e4ab17b33b11cf43d26ab526a8637a2c47b6f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-es \
man-pages-es"

RDEPENDS:${PN} += "man-pages"

inherit rpm
