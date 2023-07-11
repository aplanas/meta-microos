SUMMARY = "Convenience functions for dbus services"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides slip.dbus.service.Object, which is a dbus.service.Object \
derivative that ends itself after a certain time without being used and/or if \
there are no clients anymore on the message bus, as well as convenience \
functions and decorators for integrating a dbus service with PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python310-slip-dbus-0.6.5-6.16.noarch.rpm"
RPM_HASH = "e53bdeeaafd32207f72c3f888185f277d05912825d789411b516876aec845aa31bd5588efc93cec58b5d45c40d49cbb12f412261aca7a8aab196c0d3b52001fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-slip.dbus \
python310-slip-dbus \
python3dist-slip.dbus"

RDEPENDS:${PN} += "python-abi \
python310-dbus-python \
python310-decorator \
python310-six \
python310-slip"

inherit rpm
