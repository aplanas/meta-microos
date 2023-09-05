SUMMARY = "KF5 servicemenu for peazip"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
This subpackage contains the KF5 integration."
LICENSE = "LGPL-3.0-only"

PV = "9.4.0"

RPM_NAME = "peazip-kf5-9.4.0-1.1.noarch.rpm"
RPM_HASH = "e74c6dac65ad9acfaeb6831b8ecae81e80edd143b44746851f92a403bd5fc69c6890b059465b172a67470a65ca1886e1c532764c7e3d2caf673ce7354ad51a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "peazip-kf5"

RDEPENDS:${PN} += "peazip"

inherit rpm
