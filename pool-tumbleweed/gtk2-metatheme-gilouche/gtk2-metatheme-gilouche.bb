SUMMARY = "openSUSE themes and metathemes for gtk2, Xfwm4 and metacity"
DESCRIPTION = "OpenSUSE themes and metathemes for gtk2, Xfwm4 and metacity contains several \
themes in openSUSE look: Gilouche, GreyGilouche and Synchonicity."
LICENSE = "GPL-2.0-or-later"

PV = "11.1.2"

RPM_NAME = "gtk2-metatheme-gilouche-11.1.2-27.12.noarch.rpm"
RPM_HASH = "e007940190da8594ba934add2f0c5a6cc2b127d945e93685847ca6564d48034a307aa52b97c5e3f0eaa6b8395b76b0cccbf559f02a30e30d002733a19f42efba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-gilouche \
gtk2-theme-SLED \
gtk2-theme-openSUSE \
metacity-theme-SLED \
metacity-theme-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-engine-clearlooks \
tango-icon-theme"

inherit rpm
