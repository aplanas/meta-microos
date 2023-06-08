SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "eventviews-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3397e7602807e2ae168b3c319687bf7aea2a2ab1c676247c2b059f7421e9b3a8bbbc3d81da4e4954e64f909d99c9c157596dca39091e29c49b89c0a2e8f509fd"

RPROVIDES:${PN} += "eventviews eventviews(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
