SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-fr-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "e7386f486907b12c63202a32a576bbae318b9a795c5709f296447f24e59a7828c766cc923c1214b9e3d633dbbbc6a25b5c1fff3404bd6ca2f238ac06da3c48aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm
