SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python310-flup-1.0.3.dev20161029-4.1.noarch.rpm"
RPM_HASH = "a5fa8888a8fdaaf64969fa610246fa7857157cb7f42373ef8e2e8a47e4a9b738978cf2956eb3b257e4e5aa9ae326edffaa7b6aa041464e09e24061ad5252baba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flup \
python310-flup \
python3dist-flup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
