SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.661.aarch64.rpm"
RPM_HASH = "2bf3ab2a9c32944ee225dbac416e3d9323a01ab6592f1e7ffd2dcd91a328d4d9649ac569d85d3d666974d1421284991f2ba7844d6f5e964e2d7bb13f74b2f515"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
