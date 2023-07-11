SUMMARY = "JFreeReport General Serialization Framework"
DESCRIPTION = "Libserializer contains a general serialization framework that simplifies the \
task of writing custom java serialization handlers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.6"

RPM_NAME = "libserializer-1.1.6-1.5.noarch.rpm"
RPM_HASH = "4b00dcbb461315eb4ead34f3a940034e1c13b2a63304b5c1a164729be7f42ee887388d017b252f490c2d0bdbba241c27f1d736db29e9951dafbc6b31ef2bc4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libserializer"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
