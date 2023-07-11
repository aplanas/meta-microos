SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python311-pytest-httpx-0.22.0-2.1.noarch.rpm"
RPM_HASH = "75de7aee776e31c1d7796dafb995034bad4baf52c05615df156eebfe86d130146806aa6c8c4afbb71a2573207fa16f6c0d11611fc5b8590cf194e6a41ce36da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpx \
python3.11dist-pytest-httpx \
python311-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "python-abi \
python311-httpx \
python311-pytest"

inherit rpm
