SUMMARY = "Cockpit module for Transactional Update"
DESCRIPTION = "Cockpit module for Transactional Update"
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.9~git0.81662cf"

RPM_NAME = "cockpit-tukit-0.0.9~git0.81662cf-1.1.noarch.rpm"
RPM_HASH = "98c5af41becc611c84de399e9eed02254a0d6fea86bb46de6ca0dc353070b67c31ed3fb1184929ecad5dcffc03d1ffd074fc89b360a7aead6423624ea73a5577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-tukit"

RDEPENDS:${PN} += "cockpit-system \
tukitd"

inherit rpm
