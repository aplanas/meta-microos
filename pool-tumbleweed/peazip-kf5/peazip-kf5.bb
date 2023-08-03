SUMMARY = "KF5 servicemenu for peazip"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
This subpackage contains the KF5 integration."
LICENSE = "LGPL-3.0-only"

PV = "9.3.0"

RPM_NAME = "peazip-kf5-9.3.0-1.1.noarch.rpm"
RPM_HASH = "b72c6c390014481a632eb1d3a587b9a993b8818059eb5ba2261559675acff7d94ce897b8a11988b4349f8c71e215be9ec4717ca32c407b3297a4c87b2a2f4a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "peazip-kf5"

RDEPENDS:${PN} += "peazip"

inherit rpm
