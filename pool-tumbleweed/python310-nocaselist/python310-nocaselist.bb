SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "python310-nocaselist-1.0.6-1.5.noarch.rpm"
RPM_HASH = "2e965bccfbde574a370fc143bf9fee070d430112e351b41f5136b022ec5eca56f8b37eb035dcf3ec874133493b34c6090b939c840766e82ff3848e0609306c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nocaselist \
python310-nocaselist \
python3dist-nocaselist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
