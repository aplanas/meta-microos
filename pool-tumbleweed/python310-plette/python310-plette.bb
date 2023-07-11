SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "python310-plette-0.4.4-1.5.noarch.rpm"
RPM_HASH = "0f3147862f496ecb14938a7bf275fe2e1ac373ffe22315a0539078f1f935074f0f2765a9bbc939f13b73fe257254c042e492c747c85b7c383c3b5eda737455f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-plette \
python310-plette \
python3dist-plette"

RDEPENDS:${PN} += "python-abi \
python310-tomlkit"

inherit rpm
