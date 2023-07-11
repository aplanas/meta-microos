SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python311-publicsuffix2-2.20191221-2.1.noarch.rpm"
RPM_HASH = "efbc8094cea6845fe5b366197619f7264c9898521860d9a522cc17b5ff9b27222a8ddf21708e73d70894b026d6eeda7d7fb786723506863b824cbccb965b8921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffix2 \
python3.11dist-publicsuffix2 \
python311-publicsuffix2 \
python3dist-publicsuffix2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
