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

RPM_NAME = "python310-slip-dbus-0.6.5-6.15.noarch.rpm"
RPM_HASH = "dddfca619aaaad5ff108b45fa06773fcfecb88b705fdc8268f7ae50106f24d6cddac48d07cdaa780b1e5cbc0c7640633e781258dd9cb0d83008516a402bc35a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slip-dbus \
python3.10dist-slip.dbus \
python310-slip-dbus \
python3dist-slip.dbus"

RDEPENDS:${PN} += "python-abi \
python310-dbus-python \
python310-decorator \
python310-six \
python310-slip"

inherit rpm
