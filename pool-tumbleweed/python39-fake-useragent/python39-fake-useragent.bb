SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python39-fake-useragent-1.1.3-1.3.noarch.rpm"
RPM_HASH = "d10a51d8e837e1057a44f506c1773d4adf5fb9e0497fbe401caf9d54cd39134211f1af98cc6692617d1c36239fd06af77537387c67d41e871bc9da77af65de60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fake-useragent \
python39-fake-useragent \
python3dist-fake-useragent"

RDEPENDS:${PN} += "python-abi \
python39-importlib-resources"

inherit rpm
