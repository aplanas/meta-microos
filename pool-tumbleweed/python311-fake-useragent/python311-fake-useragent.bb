SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-fake-useragent-1.2.1-1.1.noarch.rpm"
RPM_HASH = "b58b1cebf127d51dea7ebc3d53f9ceb6bf70e47411219c2ab28878d1e9fa3028d214d4112f8bf5c506452b2b90fd671fd7682fc4fccfebd3c1cd27d6dd4482d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-useragent \
python3.11dist-fake-useragent \
python311-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python311-importlib-resources"

inherit rpm
