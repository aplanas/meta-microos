SUMMARY = "CSS based layouting framework"
DESCRIPTION = "LibLayout is a layouting framework. It is based on the Cascading StyleSheets \
standard. The layouting expects to receive its content as a DOM structure \
(although it does not rely on the W3C-DOM API)."
LICENSE = "LGPL-2.1-or-later & Unicode"

PV = "0.2.10"

RPM_NAME = "liblayout-0.2.10-6.6.noarch.rpm"
RPM_HASH = "0fd624f67864afc9929f88244ad62b20765b68d22be76475d4a8d2f2f03b0b1acc57ed455522d51fd2ca16bb15e9f2da31285a4662a9ec9392a301194d43cb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblayout"

RDEPENDS:${PN} += "flute \
java \
jpackage-utils \
libbase \
libfonts \
libloader \
librepository \
pentaho-libxml \
sac \
xml-commons-apis"

inherit rpm
