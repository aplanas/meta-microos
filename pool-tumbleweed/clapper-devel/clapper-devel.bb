SUMMARY = "Development files for clapper"
DESCRIPTION = "Development files for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "clapper-devel-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "7d87bf13e4c6a2022ab349c820868c2e7ad9f2e8e31ce9c107f052b32b095bfb6566cd73bc0d4a6d31e46f4bb37d3e40a7ff0c85a56d604caa28e18111e77e75"

RPROVIDES:${PN} += "clapper-devel"

RDEPENDS:${PN} += "libgstclapper-1-0-0 \
libgstclapperglbaseimporter0 \
typelib-1-0-GstClapper-1"

inherit rpm
