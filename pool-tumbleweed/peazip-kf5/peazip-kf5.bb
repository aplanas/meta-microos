SUMMARY = "KF5 servicemenu for peazip"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
This subpackage contains the KF5 integration."
LICENSE = "LGPL-3.0-only"

PV = "9.2.0"

RPM_NAME = "peazip-kf5-9.2.0-1.2.noarch.rpm"
RPM_HASH = "468c0b5f7df0e6e530eed7fd992f2e3c3c55a6ebc61619a3ee78db78e66e0cc20c2b4ac51fc355514168ddf3b1f374721944cbe84729f43ce054b2d812e766a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "peazip-kf5"

RDEPENDS:${PN} += "peazip"

inherit rpm
