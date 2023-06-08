SUMMARY = "Source code checker for common misspellings"
DESCRIPTION = "codespell fixes common misspellings in text files. It primarily checks \
misspelled words in source code, but it can be used with other files as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.4"

RPM_NAME = "codespell-2.2.4-1.1.noarch.rpm"
RPM_HASH = "efb0c4771a6bbcff66657de5005d9466bdf1241b41148122a7a381acc011d1b8b244edc594aa7aeb4811db22c9aa13412cfced51d090bf8895467dc58abd5cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codespell python3.10dist(codespell) python3dist(codespell)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python(abi) python3-chardet python3-setuptools"

inherit rpm
