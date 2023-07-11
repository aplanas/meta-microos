SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-wa-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "c2ac81aa021676511d13da25d1bae2c1b14979ee750553283f43508b5438e0e8b098cddc37754aaaa3ad7e98c55a9a6be8fecb45869992223c2560f607c40960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
