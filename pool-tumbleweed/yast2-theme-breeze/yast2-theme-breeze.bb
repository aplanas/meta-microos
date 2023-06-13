SUMMARY = "YaST2 - Breeze icon theme"
DESCRIPTION = "Contains icons in KDE Breeze style (from KDE Plasma 5)."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-theme-breeze-4.6.0-1.1.noarch.rpm"
RPM_HASH = "f49293dcbc174d444f8786706a64d54e5759f1011f4b284444d901cd71c182088912ccfb271132fb0edc1307351c65fc67eeb562124a89689089fee70f44c7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-theme-breeze"

RDEPENDS:${PN} += "/bin/bash \
breeze5-icons \
yast2-branding"

inherit rpm
