SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.17"

RPM_NAME = "libzypp-devel-doc-17.31.17-1.1.aarch64.rpm"
RPM_HASH = "666b8c233985829cd02461532a195f81c71d9906ae619b1908ed90744573b1ad37ea531bfbbe2af8402921579dbca8169f725b13704873b813202bf3e071d3de"

RPROVIDES:${PN} += "libzypp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
