SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python311-dbus-python-devel-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "dbb80eea755e323c98cf0a4a5b1f5da0820d359301e4576c94bd8e5dcb0a2ebc5003de73df454e65d6fb6773870bb5207962af1785233f8496c4e37514425504"

RPROVIDES:${PN} += "dbus-1-python311-devel \
pkgconfig(dbus-python-3.11) \
python311-dbus-python-devel \
python311-dbus-python-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig(dbus-1) \
python311-dbus-python \
python311-dbus-python-common-devel \
python311-devel"

inherit rpm
