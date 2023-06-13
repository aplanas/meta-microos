SUMMARY = "Brushes to be used with the MyPaint library"
DESCRIPTION = "This package contains brush files for use with MyPaint and other programs."
LICENSE = "CC0-1.0"

PV = "1.3.1"

RPM_NAME = "mypaint-brushes1-1.3.1-1.9.noarch.rpm"
RPM_HASH = "aa75ee16b23ad062b7c53d64a575082a5d120c3932813d053da61c20e0d3b3a2db78143122463f8448335b19d057477796cb7942216ab80e3bb04e23b22cd7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes \
mypaint-brushes1"

RDEPENDS:${PN} += ""

inherit rpm
