SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-bn-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "4cf3e93684b923aa43dd03c027a96436428ae5e6cb6f94bf4536d6f0eb1e711892f359e07cba0b72de27178746bd5aa4956d85b1652979bba63c828a76546d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
