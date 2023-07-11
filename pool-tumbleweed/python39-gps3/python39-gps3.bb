SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python39-gps3-0.33.3+git.20171101-1.20.noarch.rpm"
RPM_HASH = "15d0b9d2ccd24b5993b788d3411e3bd8fe64cfa9c2e1c70ee5a3076c96736fc3177d233876cf27ce4df98c764823e69b362b5961de04af9e1a47099fadc59da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gps3 \
python39-gps3 \
python3dist-gps3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
