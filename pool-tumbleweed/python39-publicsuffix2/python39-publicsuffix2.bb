SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python39-publicsuffix2-2.20191221-2.1.noarch.rpm"
RPM_HASH = "9089b46462d5500832b8db37ce022dcdb3b49789d783570a3d8e302cd3e1a27dce6a189d5a2c3f1ce40f03e6c2368665873f02e2fc5a7e67c070acd8049fa582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-publicsuffix2 \
python39-publicsuffix2 \
python3dist-publicsuffix2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
