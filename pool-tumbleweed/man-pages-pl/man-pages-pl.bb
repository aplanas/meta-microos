SUMMARY = "Translation of man pages in Polish"
DESCRIPTION = "This package provides translations of man pages in Polish."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-pl-4.19.0-1.1.noarch.rpm"
RPM_HASH = "5fa74a55429a6d14b0adc19e400ea276765d9d2519c56cb35fc399f3aa26dbf1dd5eb683eeb26fde1bf1a4cd6f092694a758c81700cf523b36d4e9aa0bd359cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:pl) \
man-pages-pl"

RDEPENDS:${PN} += "man-pages"

inherit rpm
