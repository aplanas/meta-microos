SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python311-aiosignal-1.3.1-1.3.noarch.rpm"
RPM_HASH = "69555ab9a7ff1282a0804ab742310b25151e0efaa7054054d365253a561a1537ca9571dd83fd66cb1f87252886dbe84621218d71385c467d6f1942e8d22c75d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosignal \
python3.11dist-aiosignal \
python311-aiosignal \
python3dist-aiosignal"

RDEPENDS:${PN} += "python-abi \
python311-frozenlist"

inherit rpm
