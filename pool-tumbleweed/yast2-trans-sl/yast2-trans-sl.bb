SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sl-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "2475fdd366e7a18fa3ad2276df3b72480205f5e3fed5554a787ae82a1aa066d1558385d726e7ec0b2d3fe4816c989917cfc5f300e2da00122dd47fbfe1f22f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
