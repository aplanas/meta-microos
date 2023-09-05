SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "eventviews-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5eb0c5cb86d7f1c61d7f79e617b9dfce1c23d524a1d44c49dd4ba1b8102049e00882c594aad3f4e71a849bfa968fc93e077bef0affa34bab0ab727520d7e1b41"

RPROVIDES:${PN} += "eventviews"

RDEPENDS:${PN} += ""

inherit rpm
