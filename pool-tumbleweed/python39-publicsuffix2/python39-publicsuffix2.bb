SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python39-publicsuffix2-2.20191221-1.13.noarch.rpm"
RPM_HASH = "4c35588b35b973811e716c0791d6e82897289e839917a6eaf95611079b6a6e7ae38f3526346d75b9d339e3549f6881fbb30c97f30474726bb6afbac41f923bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(publicsuffix2) \
python39-publicsuffix2 \
python3dist(publicsuffix2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
