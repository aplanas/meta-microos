SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-drms-0.6.2-1.10.noarch.rpm"
RPM_HASH = "55949ed096190c11f8d49ff71a468a81da2b3472db97762fafaa82007f3c6d67e229f2714c469480ced17493db0af4a5034e3395b740b6a87f385e2b6fa7e7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-drms \
python3.10dist-drms \
python310-drms \
python3dist-drms"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
python310-pandas \
update-alternatives"

inherit rpm
