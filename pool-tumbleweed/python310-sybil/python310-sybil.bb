SUMMARY = "Automated testing of examples in documentation"
DESCRIPTION = "python-sybil provides a way to test examples in one's documentation by parsing \
them from the documentation source and evaluating the parsed examples as part \
of the normal test run. Integration is provided for the main Python test runners."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-sybil-3.0.1-1.1.noarch.rpm"
RPM_HASH = "89cd572cb9224747e1bdc7bde7b347294bd98af17c8ca3b427e2c9174d28f2d58f27c44d71844e3799de5b9b6c9da82f5f274366e0ab5e1c9b2f92adbb53576b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sybil \
python310-sybil \
python3dist-sybil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
