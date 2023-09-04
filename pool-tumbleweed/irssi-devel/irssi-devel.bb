SUMMARY = "Development package for irssi"
DESCRIPTION = "This package contains the development files for irssi. It allows to \
compile plugins for the irssi package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "irssi-devel-1.4.4-3.2.aarch64.rpm"
RPM_HASH = "3e9f2f04375096f9758b02f572cafe9ec39d290e78eb449304f77c4571c2c40004683c9e21e451836439b605361e9344b2a4eb5d49b64fbbf3d40f2d940b4e30"

RPROVIDES:${PN} += "irssi-devel \
pkgconfig-irssi-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dante-devel \
irssi \
pkgconfig-glib-2.0"

inherit rpm
