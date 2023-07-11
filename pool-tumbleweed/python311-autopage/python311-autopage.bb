SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-autopage-0.5.1-3.5.noarch.rpm"
RPM_HASH = "e88920e4d9d7daa5c4c63c649b3cc8e05cdce9b80144367860b88fa5a191f88054d13adeddabe654a94e90c00b5b25590108838273fee33c573ef7a8400ecb3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autopage \
python3.11dist-autopage \
python311-autopage \
python3dist-autopage"

RDEPENDS:${PN} += "python-abi"

inherit rpm
