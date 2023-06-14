SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-sybil-3.0.0-3.8.noarch.rpm"
RPM_HASH = "272de9faad51a9bfd33e55c57566988d960b40432f658a75dbfe18e75adc7cfcc97ba65e96da6bcb76cfd9ee7ac04b0448be89b54839835c82322521c56a26e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sybil \
python39-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
