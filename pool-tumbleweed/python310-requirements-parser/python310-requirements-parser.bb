SUMMARY = "Pip requirement file parser"
DESCRIPTION = "A Pip requirement file parser."
LICENSE = "BSD-2-Clause"

PV = "0.2.0"

RPM_NAME = "python310-requirements-parser-0.2.0-6.3.noarch.rpm"
RPM_HASH = "6ddf09851b7fff5eeaccc9e38e56b53d7f63ff4e4749aafdb70018832f2be4cd7b7a8ceb66c5377f5704833952cb051e71d411ac55a75c0ac91ad2c06047adc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requirements-parser \
python310-requirements-parser \
python3dist-requirements-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
