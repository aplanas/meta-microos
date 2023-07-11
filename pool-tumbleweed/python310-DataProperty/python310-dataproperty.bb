SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.1"

RPM_NAME = "python310-DataProperty-0.55.1-1.3.noarch.rpm"
RPM_HASH = "e7aaf4cf180bf2aa5d0796675e25e2263b8888a2b24de44f3fa765bf3802541e58758ce35b9141f9cce66addbadbba0ef4b12d490549fcf8dc210e96e829df2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dataproperty \
python310-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python310-mbstrdecoder \
python310-typepy"

inherit rpm
