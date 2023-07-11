SUMMARY = "Documentation for log4c"
DESCRIPTION = "The liblog4c-doc package contains the log4c documentation."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c-doc-1.2.4-5.27.aarch64.rpm"
RPM_HASH = "0d6980af1a803e10139f663ea7686f68e091ae053b81e43f35fc4eddb40f6609ee1dbb513c1366722d090a6c5438b44477d483ea85350592bd91ea30209baff2"

RPROVIDES:${PN} += "liblog4c-doc"

RDEPENDS:${PN} += "liblog4c3"

inherit rpm
