SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python310-aiosignal-1.3.1-1.3.noarch.rpm"
RPM_HASH = "47dfa2d114447efd1e4cf5831cbe71e47456fde2c8e9741cb57e3757bb675566cc8bacc62024b9c7f6f1c0259663289d565983c6c1f4b4c6ee64b1454218be80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiosignal \
python310-aiosignal \
python3dist-aiosignal"

RDEPENDS:${PN} += "python-abi \
python310-frozenlist"

inherit rpm
