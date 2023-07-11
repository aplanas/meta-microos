SUMMARY = "Java CSS parser using SAC"
DESCRIPTION = "A Cascading Style Sheets parser using the Simple API for CSS, for Java."
LICENSE = "LGPL-2.1-or-later & W3C"

PV = "1.3.0"

RPM_NAME = "flute-1.3.0-6.7.noarch.rpm"
RPM_HASH = "7038cab9b6e7a001cb30912640da03010bb7ef2b7b4cfc142df2e8a6302b9ca7d877946741272cb617c7eb0f1bd3d03ba935abac3ae07e98c837d0e06aed1250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flute"

RDEPENDS:${PN} += "java \
jpackage-utils \
sac"

inherit rpm
