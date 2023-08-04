SUMMARY = "Cockpit module for Transactional Update"
DESCRIPTION = "Cockpit module for Transactional Update"
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.8~git0.a915cfd"

RPM_NAME = "cockpit-tukit-0.0.8~git0.a915cfd-1.1.noarch.rpm"
RPM_HASH = "2bc1c3d91c9b14cd4720683720f73da86c6867fec74bb6336ba5a4c475822fef06d8c79751e1ae1bb0f52575a253669effc050203e3daca05956ee8f43b8841a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-tukit"

RDEPENDS:${PN} += "cockpit-system \
tukitd"

inherit rpm
