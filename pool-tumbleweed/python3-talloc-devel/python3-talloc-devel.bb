SUMMARY = "Developer tools for the Talloc library"
DESCRIPTION = "Libraries and Header Files to Develop Programs with python3-talloc Support"
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "python3-talloc-devel-2.4.0-3.2.aarch64.rpm"
RPM_HASH = "6d3565ed9956dad1435bf3179530c8f03cf81c9a10abe25956b7c92f6bbe0ea68ded493cba6fc6e50f9afecdf1bd1f0f2a2182a2151e0635324767f5e42707cc"

RPROVIDES:${PN} += "pkgconfig-pytalloc-util.cpython-311-aarch64-linux-gnu \
python3-talloc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkg-config \
python3-talloc"

inherit rpm
