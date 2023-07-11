SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python310-ebcdic-1.1.1-2.10.noarch.rpm"
RPM_HASH = "4f1ae4c1a9a2ab1813275015c999851865e8f399cd0deba4d0c8100016954582e92a95fb889eb27b5f166020d9fec19e8b552047d65a3216eec913ac94ef8ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ebcdic \
python310-ebcdic \
python3dist-ebcdic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
