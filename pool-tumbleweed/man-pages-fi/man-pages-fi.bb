SUMMARY = "Translation of man pages in Finnish"
DESCRIPTION = "This package provides translations of man pages in Finnish."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-fi-4.20.0-1.1.noarch.rpm"
RPM_HASH = "12e39baadb1f012488d360f04c92ee946dd510c2a81a632399b8509e2e1e930aa8bd52b4fbc68350da6774c4b3ec65f185b31cf4cab9ef253af0fe12682aae71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-fi \
man-pages-fi"

RDEPENDS:${PN} += "man-pages"

inherit rpm
