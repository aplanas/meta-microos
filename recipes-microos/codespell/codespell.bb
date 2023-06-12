SUMMARY = "Source code checker for common misspellings"
DESCRIPTION = "codespell fixes common misspellings in text files. It primarily checks \
misspelled words in source code, but it can be used with other files as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.4"

RPM_NAME = "codespell-2.2.4-2.1.noarch.rpm"
RPM_HASH = "8fb313b54911d5c070572e4e07a99de745b4629dc91c0c6b402d9fd5bdcd3de9100208802dcf0a309bbb2711bcdcb20ee57b4d42fe9ff830576797bb8dfde1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codespell python3.10dist(codespell) python3dist(codespell)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python(abi) python3-chardet python3-setuptools"

inherit rpm
