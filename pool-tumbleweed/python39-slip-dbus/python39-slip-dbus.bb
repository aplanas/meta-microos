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

RPM_NAME = "python39-slip-dbus-0.6.5-6.15.noarch.rpm"
RPM_HASH = "ba3614f7318d6d1c45f9dc8d2d88866bce578e42dbad80021e811be29299dd73aeb34f8b6b176affeecfe08dde440aa318ce0afbb0f59647863ec2f2c8464bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(slip.dbus) \
python39-slip-dbus \
python3dist(slip.dbus)"

RDEPENDS:${PN} += "python(abi) \
python39-dbus-python \
python39-decorator \
python39-six \
python39-slip"

inherit rpm
