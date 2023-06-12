SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python310-publicsuffix2-2.20191221-1.13.noarch.rpm"
RPM_HASH = "a0ea7844ddab0133fe9f10473bc7542ac32b7f3e94ecaf9832b6daf7162889c051303374455152b6c75b769ff16ab376d7692f1c0a0ab28e81d5505b23c263ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffix2 \
python3.10dist(publicsuffix2) \
python310-publicsuffix2 \
python3dist(publicsuffix2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
