SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python39-dbus-python-devel-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "19b3eae6338bfb6e7deaf872525dd28c59ea6bbd35177dca3507b0d1587b9000f41afdf3ad45c4c478b7668a8776e137ea899ed0d4bad34caaff01ff7e735726"

RPROVIDES:${PN} += "dbus-1-python39-devel \
pkgconfig-dbus-python-3.9 \
python39-dbus-python-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig-dbus-1 \
python39-dbus-python \
python39-dbus-python-common-devel \
python39-devel"

inherit rpm
