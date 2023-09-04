SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-en_GB-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "d0be5276391fa18d5bf016eae0cee122bbc697bdf7333b4e0b01d1aa0493d0f37669a43b506d40bcf0971175b7621691302f79e3c5db32a8e39b515da6f7f4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
