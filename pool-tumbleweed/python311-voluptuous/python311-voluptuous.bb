SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-voluptuous-0.13.1-1.5.noarch.rpm"
RPM_HASH = "5f0241f9dc80f812570f075dd6df46d3be40cdcb343688379766df2ebdf8fa6f8c0cd6fa74de0e2d657450537e916622dd68d96d344203ef9a5de02e6f2e8aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-voluptuous \
python3.11dist-voluptuous \
python311-voluptuous \
python3dist-voluptuous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
