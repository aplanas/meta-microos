SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-tr-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "71f909ff22f412f888f6e9f62cb7fc2f487d49dc77f9dbfc32074f00870e96cffcff222d219e19aa053df2ba9e40a88b67e3d78879deebab2e67acef4a75a636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm
