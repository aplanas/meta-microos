SUMMARY = "KF5 servicemenu for peazip"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
This subpackage contains the KF5 integration."
LICENSE = "LGPL-3.0-only"

PV = "9.2.0"

RPM_NAME = "peazip-kf5-9.2.0-1.1.noarch.rpm"
RPM_HASH = "2312897acf484806e44069ebba72182e25284a9ff4ed758b41fcd48f876eca5d6643130df0fd6ebc0eae78b90d5e14a764dd955db349c87291fff44252f24d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "peazip-kf5"
RDEPENDS:${PN} += "peazip"

inherit rpm
