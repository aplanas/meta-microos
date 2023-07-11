SUMMARY = "Voice files for gcompris-qt"
DESCRIPTION = "This is the voice data package for gcompris-qt-voices. This a full bundle for \
when you do not want to use the automatic online feature. \
 \
This allow you to play gcompris-qt-voices activities in different languages."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & CC-BY-SA-1.0+ & GFDL-1.1-or-later & SUSE-Public-Domain & SUSE-Free-Art-1.3"

PV = "3.3~20230606"

RPM_NAME = "gcompris-qt-voices-3.3~20230606-1.1.noarch.rpm"
RPM_HASH = "8f13f62d50ec9a46be38ce4c133f58017d3f2d9c1c17cdbc8e0982c1cc6686d817f3d90d523a9808ebcd6ceb23d6db345112a266f1804932840580f85afd3ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-voices \
gcompris-voices \
locale-gcompris-en"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
