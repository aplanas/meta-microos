SUMMARY = "Pentaho Flow Reporting Engine"
DESCRIPTION = "Pentaho Reporting Flow Engine is a free Java report library, formerly \
known as 'JFreeReport'"
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "pentaho-reporting-flow-engine-0.9.4-6.7.noarch.rpm"
RPM_HASH = "a712facb81a4aa577ae407b854633e6e7000aba1469c764fbbd20cf7a7ca9853da84f2a213774bf5336fca062a9fe0b09c6bb97ec00d82fce8f94c2aa8f2826b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-reporting-flow-engine"

RDEPENDS:${PN} += "flute \
java \
jpackage-utils \
libbase \
libfonts \
libformula \
liblayout \
librepository \
libserializer \
pentaho-libxml \
sac"

inherit rpm
