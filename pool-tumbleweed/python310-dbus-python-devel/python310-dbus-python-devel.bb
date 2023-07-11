SUMMARY = "Python bindings for D-Bus -- development files"
DESCRIPTION = "D-Bus python bindings for use with python programs. \
 \
This package contains the development files for \
Python bindings for D-Bus."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python310-dbus-python-devel-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "91fe6dae75496817dba2159f0e0943712a8d665bd7e751f8bb48219f748da8e77b4fe5ef36cc3a0f3826bf4cab066c579451bbedaf9b07cc62219dc181b15d6f"

RPROVIDES:${PN} += "dbus-1-python310-devel \
pkgconfig-dbus-python-3.10 \
python310-dbus-python-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
dbus-1-devel \
pkgconfig-dbus-1 \
python310-dbus-python \
python310-dbus-python-common-devel \
python310-devel"

inherit rpm
