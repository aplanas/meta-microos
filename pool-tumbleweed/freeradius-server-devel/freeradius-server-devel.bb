SUMMARY = "FreeRADIUS Development Files"
DESCRIPTION = "FreeRADIUS header files for development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-devel-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "93587750692a45394ec8b2d5e93a942da2373fb8a7df9bb2364d9fed48fc59aecf33a05fd14e3553a7e401f2f0a5f48b24530ca1f64e26d7120e0f112482a03f"

RPROVIDES:${PN} += "freeradius-server-devel"

RDEPENDS:${PN} += "freeradius-server-libs"

inherit rpm
