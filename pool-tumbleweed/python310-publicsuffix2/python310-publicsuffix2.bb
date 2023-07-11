SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python310-publicsuffix2-2.20191221-2.1.noarch.rpm"
RPM_HASH = "24e8d962477b834b224c3793dc0a8c7f064baf1dadc505fc7fd5835e4e03b8c642ff9bea4fba19302930cc6c5ff9306a371e0eded214a827c60e9f074b0b1a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-publicsuffix2 \
python310-publicsuffix2 \
python3dist-publicsuffix2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
