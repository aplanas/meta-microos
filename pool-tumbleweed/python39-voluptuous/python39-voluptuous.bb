SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-voluptuous-0.13.1-1.3.noarch.rpm"
RPM_HASH = "70522ca122676320d9852150ac36ef172d3d00b8c2bfcae95fe79d5447497984b12b211471f049a532229213b61d10a571c09f622dac64e5da6438ceb32ace0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-voluptuous \
python39-voluptuous \
python3dist-voluptuous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
