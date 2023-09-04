SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ps-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "9a7bd96e740f2405243de1b8c58cd2139b82be802c833e4ebe57a6fd2d9f089aea96809db413ebee26d27ceadf4b5f8217be183c6dcca6cd27ba5db7bf42adf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm
