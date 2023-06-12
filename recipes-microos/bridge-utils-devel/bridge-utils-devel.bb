SUMMARY = "Development files for bridge-utils"
DESCRIPTION = "The bridge-utils devel package contains files needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "bridge-utils-devel-1.7.1-1.9.aarch64.rpm"
RPM_HASH = "66ffc3977725055444051b9dad128ae3505dcfe7afb7e9b3b742b2af1ee764968b2147a254045eb053fd879d50260cf60c95aa5d00ab821864f5bc3452ef4e93"

RPROVIDES:${PN} += "bridge-utils-devel \
bridge-utils-devel(aarch-64)"
RDEPENDS:${PN} += "bridge-utils"

inherit rpm
