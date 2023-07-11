SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python310-respx-0.20.1-2.1.noarch.rpm"
RPM_HASH = "fd34177113d410d6d7756f6bdd1312e63217520c29eaf0812f247b97ac2461f9bf377780f186090c176c3229886605d08023055e72616abc9f753e00f00b1016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-respx \
python310-respx \
python3dist-respx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
