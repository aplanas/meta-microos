SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "python310-progressbar2-4.2.0-2.4.noarch.rpm"
RPM_HASH = "51e958329612e5f6fcf3b4b83ec175ad80c1964b8496162ca78782b50d6ee28530e42031260ca2ffa54e567efc91667030d75e0d13a30c2dd0c932e675a42bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-progressbar2 \
python310-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python310-python-utils"

inherit rpm
