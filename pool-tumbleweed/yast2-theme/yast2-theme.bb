SUMMARY = "YaST2 - Theme"
DESCRIPTION = "Contains necessary theming resources to use YaST2."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-theme-4.6.0-1.2.noarch.rpm"
RPM_HASH = "2afe76ce2379aa08d6d012da752c4b07f41f95fd586fa764a6ae92ca52e91a3cbcab32ace2f2c110c3f6f13a646ab0333762717198d2546b3ff832f62b0c371d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-yast2-theme \
yast2-branding \
yast2-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
google-poppins-fonts \
hicolor-icon-theme \
yast2-qt-branding"

inherit rpm
