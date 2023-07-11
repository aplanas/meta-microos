SUMMARY = "Examples for Xapian-core libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval Library. \
 \
This subpackage contains some examples for Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "xapian-core-examples-1.4.21-1.4.aarch64.rpm"
RPM_HASH = "25cc3d14ac4f4f969149e575103decb5a57b300478e1ee891df2f8c26a5b5ca461d9baf270c75c013ebc7916b61d71117e38666995204ad4c541a946f328bc65"

RPROVIDES:${PN} += "xapian-core-examples"

RDEPENDS:${PN} += "xapian-core"

inherit rpm
