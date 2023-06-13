SUMMARY = "Developer tools for the Talloc library"
DESCRIPTION = "Libraries and Header Files to Develop Programs with python3-talloc Support"
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "python3-talloc-devel-2.4.0-3.1.aarch64.rpm"
RPM_HASH = "549f3fdded95060a3a03bdd45c2f69620da62da495683172138edbf9a83daed74888adebe507a9eab4dd60d3f8fd477ce2428e3c39cd0d7e04911f34c43bd158"

RPROVIDES:${PN} += "pkgconfig(pytalloc-util.cpython-310-aarch64-linux-gnu) \
python3-talloc-devel \
python3-talloc-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkg-config \
python3-talloc"

inherit rpm
