SUMMARY = "Translation of man pages in Vietnamese"
DESCRIPTION = "This package provides translations of man pages in Vietnamese."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-vi-4.20.0-1.1.noarch.rpm"
RPM_HASH = "9cb2290996606b6ec959ea5b955eedcab79ed48a8fca4e6417ad4f14de54a10fb814a63be2e727e87ee51a7f0a9acb4d58f2eaac04bd25e8ab8f0b750d254635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-vi \
man-pages-vi"

RDEPENDS:${PN} += "man-pages"

inherit rpm
