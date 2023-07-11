SUMMARY = "Libraries for gsettings-qt"
DESCRIPTION = "Qt/QML bindings for GSettings. \
 \
This package contains the header files and developer \
docs for gsettings-qt."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "gsettings-qt-devel-0.2-1.10.aarch64.rpm"
RPM_HASH = "a74c1ebc43a776545bfdb1011359a5d6a217297b5cf9413c7e2b01936545bc122da3cfc24ecb8b100eac1786fac4a0f2af4239588f72fb6ac0329db5dcd79c23"

RPROVIDES:${PN} += "gsettings-qt-devel \
pkgconfig-gsettings-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsettings-qt1"

inherit rpm
