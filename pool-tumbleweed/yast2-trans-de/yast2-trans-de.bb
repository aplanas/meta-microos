SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-de-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "57d99dcd2c4ceb525af858449ab28d51afbf6704457a4e4f7c10399698f99b2f3837179678c6257f87793d3af3c64abdc629d8974882ed5deb48a22eca9eed8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm
