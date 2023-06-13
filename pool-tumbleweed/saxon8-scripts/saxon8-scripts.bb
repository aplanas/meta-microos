SUMMARY = "Utility scripts for saxon8"
DESCRIPTION = "Utility scripts for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-scripts-B.8.8-133.6.noarch.rpm"
RPM_HASH = "3898f2a12694205f553e0c92c5528703880617ad2b69b5207eb9dd226875ab4a5a9a73774f75f4cd4bf1542c163c9cae1701542daf7230367992719227e14fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-scripts"

RDEPENDS:${PN} += "saxon8"

inherit rpm
