SUMMARY = "Development files for clxclient"
DESCRIPTION = "Development files for clxclient including headers and libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.2"

RPM_NAME = "clxclient-devel-3.9.2-2.12.aarch64.rpm"
RPM_HASH = "1869aa0b359e23cf34fec1572ae7bba7bddab24efddfba1b80ed289e4a977be1027114d2c3a9691576c486b922e301b52946f7c93445479669836738f9f3a76b"

RPROVIDES:${PN} += "clxclient-devel clxclient-devel(aarch-64)"
RDEPENDS:${PN} += "clthreads-devel libclxclient3 pkgconfig(freetype2) pkgconfig(x11) pkgconfig(xft) pkgconfig(xproto)"

inherit rpm
