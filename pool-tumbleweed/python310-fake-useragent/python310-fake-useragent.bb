SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python310-fake-useragent-1.1.3-1.1.noarch.rpm"
RPM_HASH = "6fb0f2f7ce49e56e903ab02933c85fcdfd5ce26e9dba51a9e338865239141adbb9ba28993952291a0af7285bb639e4345925b90a18ab97bc9046426dca741d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-useragent \
python3.10dist(fake-useragent) \
python310-fake-useragent \
python3dist(fake-useragent)"
RDEPENDS:${PN} += "python(abi) \
python310-importlib-resources"

inherit rpm
