SUMMARY = "Python bindings for D-Bus -- shared development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains development files shared between \
the Python2 and Python3 versions of the bindings."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python-dbus-python-common-devel-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "d339115d89cba273ef2a2d0c214cca26c15456a655fc28dbe7962b44287465947d67941f11b002d293796b709493b78480db47cadf453dc33441da35d8279e6a"

RPROVIDES:${PN} += "pkgconfig(dbus-python) \
python-dbus-python-common-devel \
python-dbus-python-common-devel(aarch-64) \
python310-dbus-python-common-devel \
python311-dbus-python-common-devel \
python39-dbus-python-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
pkgconfig(dbus-1) \
pkgconfig(dbus-glib-1)"

inherit rpm
