SUMMARY = "Resource Loading Framework"
DESCRIPTION = "LibLoader is a general purpose resource loading framework. It has been \
designed to allow to load resources from any physical location and to \
allow the processing of that content data in a generic way, totally \
transparent to the user of that library."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libloader-1.1.6-1.5.noarch.rpm"
RPM_HASH = "8d44344a777580af2de7de5031c1f053361af2f3d11190d8e42b9ef2a68772d6c9aa82978501ced8ebf708e8379b9cdae4b1d0d16ccc4bb401a2060693ee71b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libloader"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
