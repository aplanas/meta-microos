SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-tools-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "48d8bc4341404750882da08fa65f745749f06567ee0fab869d72bd225d3a1f294420e1696f12f8c8336c42e8cad959be8d96c6bfa08cc3cf9f935fd7ffd3b172"

RPROVIDES:${PN} += "python312-2to3 \
python312-demo \
python312-tools"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312-base"

inherit rpm
