SUMMARY = "Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-publicsuffix-1.1.1-1.14.noarch.rpm"
RPM_HASH = "5308bd7bfb508fbbbc68f7d21045825f0f2ab5e8339f57a52d38ad93091db73275eefb208e1256c49697b9024055ebcbc47efd60813a9018b9d50571c06341d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-publicsuffix \
python310-publicsuffix \
python3dist-publicsuffix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
