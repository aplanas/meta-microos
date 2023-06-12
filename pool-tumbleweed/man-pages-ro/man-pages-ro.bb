SUMMARY = "Translation of man pages in Romanian"
DESCRIPTION = "This package provides translations of man pages in Romanian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-ro-4.19.0-1.1.noarch.rpm"
RPM_HASH = "220d02ae86789a8526df5765227fe24fcf3b695bba974f8f438cb14e5f2d853632fa2be5f24d606030155bafe6f474dbe118e9d3a60d2316866ad0b501c53426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:ro) \
man-pages-ro"
RDEPENDS:${PN} += "man-pages"

inherit rpm
