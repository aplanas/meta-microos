SUMMARY = "Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-publicsuffix-1.1.1-1.14.noarch.rpm"
RPM_HASH = "50e610870637e5bdf214258e8495ed258833bda864c88c26ddf50edd2cb9f65078ee582d64223a14b1d045f82d8ef8cc343e597032c026f4df35bf7c67ebe869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffix \
python3.11dist-publicsuffix \
python311-publicsuffix \
python3dist-publicsuffix"

RDEPENDS:${PN} += "python-abi"

inherit rpm
