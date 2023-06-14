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

RPM_NAME = "python311-slip-dbus-0.6.5-6.15.noarch.rpm"
RPM_HASH = "7c977c0b4b23bb322bb01f6004969db41de973f35d2162bc6dc7c3f92898352108113c4da3be804e7ea0f1a5392c27cebbdbd4328cf6d8098b118a17b67d542a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-slip.dbus \
python311-slip-dbus \
python3dist-slip.dbus"

RDEPENDS:${PN} += "python-abi \
python311-dbus-python \
python311-decorator \
python311-six \
python311-slip"

inherit rpm
