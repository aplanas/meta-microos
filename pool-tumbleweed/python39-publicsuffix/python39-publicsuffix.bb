SUMMARY = "Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-publicsuffix-1.1.1-1.14.noarch.rpm"
RPM_HASH = "4e3807eaf051a99e1a73065910aa79f719369a01c43e02da846526fb2f337398b7a2e6a17d3a361861eba1359120a8da73fcab0181de6c5e5007fd58e4fa7d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-publicsuffix \
python39-publicsuffix \
python3dist-publicsuffix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
