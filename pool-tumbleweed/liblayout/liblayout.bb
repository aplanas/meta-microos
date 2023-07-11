SUMMARY = "CSS based layouting framework"
DESCRIPTION = "LibLayout is a layouting framework. It is based on the Cascading StyleSheets \
standard. The layouting expects to receive its content as a DOM structure \
(although it does not rely on the W3C-DOM API)."
LICENSE = "LGPL-2.1-or-later & Unicode"

PV = "0.2.10"

RPM_NAME = "liblayout-0.2.10-6.7.noarch.rpm"
RPM_HASH = "fd0e5d44305984b3c10a7cbb35c64feb306d3c57d1dae35696e7cc04be2b4513a9a9ddeea1ea58372a103efb3d3af8d8e65774b95cb0ee60821d6693d9bd3484"
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
