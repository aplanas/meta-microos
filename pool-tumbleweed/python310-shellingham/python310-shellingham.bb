SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.0"

RPM_NAME = "python310-shellingham-1.5.0-2.3.noarch.rpm"
RPM_HASH = "54cd3b3c4831c06f8ecbf8314307ac9d055c6d6f422632d903c57b53b8319a5b155d167def5f676b9959a6669115c672fbf0e6bc14aec5d70c99f61e7125c6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-shellingham \
python310-shellingham \
python3dist-shellingham"

RDEPENDS:${PN} += "python-abi"

inherit rpm
