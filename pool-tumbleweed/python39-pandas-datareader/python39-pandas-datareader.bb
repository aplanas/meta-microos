SUMMARY = "Data readers extracted from the pandas codebase"
DESCRIPTION = "Remote data access for pandas. Works for multiple versions of pandas."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python39-pandas-datareader-0.10.0-1.4.noarch.rpm"
RPM_HASH = "a7e33f425e921f8d41d6139e0aafdc36e9e54ab8976dc10146215ec4bd6ebb33f377112c222493d1cf384a455f7b0b104f570e5f72f74d0dc59a409c6aa32572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pandas-datareader \
python39-pandas-datareader \
python3dist-pandas-datareader"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-pandas \
python39-requests"

inherit rpm
