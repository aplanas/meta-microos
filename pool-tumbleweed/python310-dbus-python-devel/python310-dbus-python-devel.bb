SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python310-dbus-python-devel-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "d33e7087b2b1427ca36c2de86bc6775305255074feb34367572d6cf76ed7caadaf3c1cdad8cdaeecc79cdd795602b2512c12380a380b9a0ce4ee3f7d82e05adb"

RPROVIDES:${PN} += "dbus-1-python3-devel \
dbus-1-python310-devel \
pkgconfig(dbus-python-3.10) \
python3-dbus-python-devel \
python310-dbus-python-devel \
python310-dbus-python-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig(dbus-1) \
python310-dbus-python \
python310-dbus-python-common-devel \
python310-devel"

inherit rpm
