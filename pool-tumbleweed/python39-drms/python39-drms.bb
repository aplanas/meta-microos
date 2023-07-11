SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python39-drms-0.6.4-1.1.noarch.rpm"
RPM_HASH = "0cadbae46a2d6bf94c181fdb4d42b0c71dd5d107573995d600f551bc825cbeac5d55dec30f2829bcd42bdb831196decccc895b5dabc2af6e102649015411bece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-drms \
python39-drms \
python3dist-drms"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-numpy \
python39-pandas \
update-alternatives"

inherit rpm
