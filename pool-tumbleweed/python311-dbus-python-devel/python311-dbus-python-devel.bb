SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python311-dbus-python-devel-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "4ffd506c276c4c24b466eab70e293752d7462c47b9d6fec52aa103bc65fda9e6f80214194d29d0032a9a277250e4897198cc54ff3f7779a45fc30daf972c73d7"

RPROVIDES:${PN} += "dbus-1-python3-devel \
dbus-1-python311-devel \
pkgconfig-dbus-python-3.11 \
python3-dbus-python-devel \
python311-dbus-python-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig-dbus-1 \
python311-dbus-python \
python311-dbus-python-common-devel \
python311-devel"

inherit rpm
