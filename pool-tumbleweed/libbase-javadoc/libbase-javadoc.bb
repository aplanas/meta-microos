SUMMARY = "Javadoc for libbase"
DESCRIPTION = "Javadoc for libbase."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libbase-javadoc-1.1.6-1.4.noarch.rpm"
RPM_HASH = "37aa12b975e7af3118176af537ea3a888ba5249825db1c78a4ca2c8510a4d679b7f12a2a26cae45c4f269a088b52b5ea5d83f469b4f64107d3daeece8c1de71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbase-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
