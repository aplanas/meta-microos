SUMMARY = "Libraries for gsettings-qt"
DESCRIPTION = "Qt/QML bindings for GSettings. \
 \
This package contains the header files and developer \
docs for gsettings-qt."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "gsettings-qt-devel-0.2-1.9.aarch64.rpm"
RPM_HASH = "0823191ad132e36f1e3dbd0a318d78fd46e31e96468a47de3dd33d633f0d2af3857d17696e2d43d45dd1549928f1095d3d48eeb510543260926549d6cfdc0d99"

RPROVIDES:${PN} += "gsettings-qt-devel \
pkgconfig-gsettings-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsettings-qt1"

inherit rpm
