SUMMARY = "Java CSS parser using SAC"
DESCRIPTION = "A Cascading Style Sheets parser using the Simple API for CSS, for Java."
LICENSE = "LGPL-2.1-or-later & W3C"

PV = "1.3.0"

RPM_NAME = "flute-1.3.0-6.6.noarch.rpm"
RPM_HASH = "1566d1ce6a8f9329d6cd5e4cb3a8aa4dddff64bfa82731be420dc273da9d5896941f9f82a5c454808d63a387a2b1b60907c557419fb237c9361d223f5678ae92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flute"

RDEPENDS:${PN} += "java \
jpackage-utils \
sac"

inherit rpm
