SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-fake-useragent-1.2.1-1.1.noarch.rpm"
RPM_HASH = "0a1c5c0af5f0091ff89fa4be744650ededd057bff256fded42802792484608a2d6c26a9d2c8ef5d6e6b3e30c45404a7c316b63bac97e67c3d1be849131b25c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fake-useragent \
python39-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python39-importlib-resources"

inherit rpm
