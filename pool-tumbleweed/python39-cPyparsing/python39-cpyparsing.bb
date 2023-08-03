SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.2.1.2"

RPM_NAME = "python39-cPyparsing-2.4.7.2.1.2-1.1.aarch64.rpm"
RPM_HASH = "459f3fb5542632b4dc75590e5f53570cea1f9cf574e8a002c78e71c5e619f71afb52be5b218eee9e3a13e8d901cef759f071b9d9d8df07392f90d2f5bf67982a"

RPROVIDES:${PN} += "python3.9dist-cpyparsing \
python39-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
