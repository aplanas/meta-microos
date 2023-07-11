SUMMARY = "Python bindings for D-Bus -- shared development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains development files shared between \
the Python2 and Python3 versions of the bindings."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python-dbus-python-common-devel-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "2d477a50606e9a34ef33b105310df029759b620eb1eca970e4c2300fa801391426fbcf44c825d59fb7ae98e00b8288f9b71827e60bb24f35ed78d8d30d9e75a1"

RPROVIDES:${PN} += "pkgconfig-dbus-python \
python-dbus-python-common-devel \
python310-dbus-python-common-devel \
python311-dbus-python-common-devel \
python39-dbus-python-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
pkgconfig-dbus-1 \
pkgconfig-dbus-glib-1"

inherit rpm
