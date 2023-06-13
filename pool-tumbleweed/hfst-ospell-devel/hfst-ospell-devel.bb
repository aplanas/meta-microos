SUMMARY = "HFST spell checker development files"
DESCRIPTION = "Development headers and libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "hfst-ospell-devel-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "9420efef5b299395f70c896fbd2d887ae157e0d0ce7e269c0e65d23279c0feed5e0d8d7c1f1a9e0d302b3827877897e5010d3e2e8dae179c21d560536b695c91"

RPROVIDES:${PN} += "hfst-ospell-devel \
hfst-ospell-devel(aarch-64) \
pkgconfig(hfstospell)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hfst-ospell"

inherit rpm
