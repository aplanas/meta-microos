SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-autopage-0.5.1-3.3.noarch.rpm"
RPM_HASH = "b8edda1cf1cfd664ac805a206eb62a7bf65897ce04c61a304c97e4233a035bf1583e894ac06b2e9a80157db8f77e274afa1e7bc97009f30547a292caeecafc14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autopage \
python3.10dist-autopage \
python310-autopage \
python3dist-autopage"

RDEPENDS:${PN} += "python-abi"

inherit rpm
