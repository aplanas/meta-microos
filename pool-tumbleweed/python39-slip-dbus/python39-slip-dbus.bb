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

RPM_NAME = "python39-slip-dbus-0.6.5-6.16.noarch.rpm"
RPM_HASH = "a44dcf2ac28fcd8afa29089bb0294f02e40ac4fe4818ca468cea73a192887ced9c1c78dbfe2e4e72af3870eab5634616b33cd5b13c0d90edfe5f599d6dfa991a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-slip.dbus \
python39-slip-dbus \
python3dist-slip.dbus"

RDEPENDS:${PN} += "python-abi \
python39-dbus-python \
python39-decorator \
python39-six \
python39-slip"

inherit rpm
