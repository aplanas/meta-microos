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

RPM_NAME = "python311-slip-dbus-0.6.5-6.16.noarch.rpm"
RPM_HASH = "4fea47c7a3bd37c1f1c7c450daed03640300b3f19e78b3b3b4d95943d8e76f583d957d464472330372033cb6d51932af3ac2a4786e7d49a7ccc352d47f435f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slip-dbus \
python3.11dist-slip.dbus \
python311-slip-dbus \
python3dist-slip.dbus"

RDEPENDS:${PN} += "python-abi \
python311-dbus-python \
python311-decorator \
python311-six \
python311-slip"

inherit rpm
