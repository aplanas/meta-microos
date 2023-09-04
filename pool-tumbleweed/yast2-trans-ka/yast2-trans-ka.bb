SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ka-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "5421f0a3d196ca818b876841ac59736fcec2c90c18d4a605b9dd2d2a5cad1af25cdf90963d713c617ed99716abb77e12c2056678703ff666a1a04c9f26fb09f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
