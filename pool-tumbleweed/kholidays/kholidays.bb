SUMMARY = "Holiday calculation library"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kholidays-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "1f254c7287c29c3961e6377f9b99ac3273205102ce1fdb94ccd00d964836619668cf1d8374cca66bdfd17c44c41cfbe0bec3bb29f3d3f64456199587ccc6858d"

RPROVIDES:${PN} += "kholidays"

RDEPENDS:${PN} += ""

inherit rpm
