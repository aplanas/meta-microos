SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-tools-3.12.0b3-1.2.aarch64.rpm"
RPM_HASH = "d0424061e4503680f9668ebdf3a898561ef1cc8b82da59d24f762eb03e0c9743b609932f51615d3147f51dd37e6718d57bc96beb22566b814d5e2559f40f413d"

RPROVIDES:${PN} += "python312-2to3 \
python312-demo \
python312-tools"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312-base"

inherit rpm
