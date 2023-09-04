SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sr-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "62fe63c57669e3f638061b3f2e7cfb7026ba7499a8b2015db5bd633a6677db4715ce3900481732c29f5662eafbf4fde31c2f5b40673e2fe965daf61c7e1b572d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm
