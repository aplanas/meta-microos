SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python310-vcversioner-2.16.0.0-4.10.noarch.rpm"
RPM_HASH = "38d4bfbbb3c14a7a0749d1c8e593fcd5aa71811db6277cf829aa5ef981996f3db44f9ea691153fa34a69eb89fc13ed4056396e0644fd3853eeb257a6e69412f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vcversioner \
python310-vcversioner \
python3dist-vcversioner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
