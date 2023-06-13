SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python39-aiosignal-1.3.1-1.1.noarch.rpm"
RPM_HASH = "cdb49465eb675136d944b6abc3017cfb7cf8e8383c1f9d4603c1a3e2cb48bbc7ab8858169b2afa54a977dc11601031c7fe6c0f18cd2a360c856e3d115c19aea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiosignal) \
python39-aiosignal \
python3dist(aiosignal)"

RDEPENDS:${PN} += "python(abi) \
python39-frozenlist"

inherit rpm
