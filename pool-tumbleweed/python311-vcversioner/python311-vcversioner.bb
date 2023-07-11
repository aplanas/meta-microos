SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python311-vcversioner-2.16.0.0-4.10.noarch.rpm"
RPM_HASH = "6d40b390c3b1f8a9b77429a85f1fc87993242c15279d49602d0c3fe06aed678e26027b6ede1d832aa79a4774af68d278b7244ae51f254b36bc21c68761d6ae7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcversioner \
python3.11dist-vcversioner \
python311-vcversioner \
python3dist-vcversioner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
