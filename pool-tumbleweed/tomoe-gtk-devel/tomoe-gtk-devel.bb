SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-devel-0.6.0-44.25.aarch64.rpm"
RPM_HASH = "04a2ccf9b2e5524c70c05852e0e32af6aa81f704df0b4c2c06be482ae2c3b2aa52f0bd0c0fbfa0654079a4e6a7d9d6dd8b127a1b3ac73968cb855a0dd5ccc1ab"

RPROVIDES:${PN} += "pkgconfig-tomoe-gtk \
tomoe-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gucharmap-devel \
pkgconfig-gtk+-2.0 \
pkgconfig-tomoe \
tomoe-devel \
tomoe-gtk"

inherit rpm
