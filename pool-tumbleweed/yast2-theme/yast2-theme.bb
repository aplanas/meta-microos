SUMMARY = "YaST2 - Theme"
DESCRIPTION = "Contains necessary theming resources to use YaST2."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-theme-4.6.0-1.1.noarch.rpm"
RPM_HASH = "e21dab987d5beba4a0beab63dac3f456559337b386043f6c82f7f7aea1c4ed724068b0865226aa75977c8df2d36fd71581f3c472f8bb7a473f652c5fdfe41b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-yast2-theme \
yast2-branding \
yast2-theme"

RDEPENDS:${PN} += "/bin/sh \
google-poppins-fonts \
hicolor-icon-theme \
yast2-qt-branding"

inherit rpm
