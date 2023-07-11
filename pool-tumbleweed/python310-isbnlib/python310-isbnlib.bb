SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.12"

RPM_NAME = "python310-isbnlib-3.10.12-1.6.noarch.rpm"
RPM_HASH = "7d9e6dbc96531dd96b711c1c81c830fb684eff94da7301ef30deb85e718637c338deb18e7a0dcfdc3a913bae451f73122b6403ce839674dd27d126981bdf028c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isbnlib \
python310-isbnlib \
python3dist-isbnlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
