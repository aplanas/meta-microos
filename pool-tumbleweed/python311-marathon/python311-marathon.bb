SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-marathon-0.13.0-2.8.noarch.rpm"
RPM_HASH = "e965c80687bebb7c314336d312fd7c287ebce19942fd71f34d70c2c30b1cff53bd0bf735736c1ebe4f891b55bc906976883b89b3916571ca9ec5f39869843b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marathon \
python3.11dist-marathon \
python311-marathon \
python3dist-marathon"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-requests-toolbelt"

inherit rpm
