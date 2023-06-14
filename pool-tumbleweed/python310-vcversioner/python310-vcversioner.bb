SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python310-vcversioner-2.16.0.0-4.8.noarch.rpm"
RPM_HASH = "35cc9e97ed3531a6ce1bdaff9f78a968e74217c36fb50a2f47195ecaff76bf5359e22854a7c90740d592b281688831ad88b39cc3c91564bdfc6f08c3b1de6290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcversioner \
python3.10dist-vcversioner \
python310-vcversioner \
python3dist-vcversioner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
