SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python310-ebcdic-1.1.1-2.9.noarch.rpm"
RPM_HASH = "b5a732f53f2f2e59d0c2ddd4ad2c74eaed7e18f288302affb5640da6cfd5c66146497c633d416d85db710a41fe25a83428bb0e8846d62d82c094a3b0abf4576c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ebcdic \
python3.10dist-ebcdic \
python310-ebcdic \
python3dist-ebcdic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
