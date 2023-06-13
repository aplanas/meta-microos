SUMMARY = "INI file parser library - development files"
DESCRIPTION = "libconfini is a INI file parser library written in C. \
This package contains files required for development."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.4"

RPM_NAME = "libconfini-devel-1.16.4-1.4.aarch64.rpm"
RPM_HASH = "f07fa016d5798513b852419ac5375ca707e8c777539c600624959505075f7ed2ac67a77e845b849c8a839b6d2290e856defb786b4ab46d318a2c045a452cf3ff"

RPROVIDES:${PN} += "libconfini-devel \
libconfini-devel(aarch-64) \
pkgconfig(libconfini)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfini0"

inherit rpm
