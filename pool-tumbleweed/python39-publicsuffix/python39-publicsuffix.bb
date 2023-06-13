SUMMARY = "Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-publicsuffix-1.1.1-1.12.noarch.rpm"
RPM_HASH = "c52e1cc25b5efc08c01167cb3fa76702759adca171b8989c8816da6a84961d85134871ea79fd4befbd8fa9839ca9cb4ef100ab8b4af323b7f0186c1dd81b6754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(publicsuffix) \
python39-publicsuffix \
python3dist(publicsuffix)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
