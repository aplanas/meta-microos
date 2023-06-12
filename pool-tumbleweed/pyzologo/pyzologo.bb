SUMMARY = "Icons for Pyzo"
DESCRIPTION = "Icons used by pyzo"
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "pyzologo-4.11.2-1.12.noarch.rpm"
RPM_HASH = "f81aea61032b5b893e0ad5d6216410544e8107148c948b0f6cd9f83868fef273ac568846c12d64996b86e64e777723682ff51663db27200c2ab114ddf79b1841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyzologo"
RDEPENDS:${PN} += ""

inherit rpm
