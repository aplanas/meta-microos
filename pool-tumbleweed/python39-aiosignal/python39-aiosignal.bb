SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python39-aiosignal-1.3.1-1.3.noarch.rpm"
RPM_HASH = "a6cc024e3f4ee2b1f39363f115d46b5c956e3e87659652959e1ca0751671e94a0215cbf4f3dccce77fdc1919d5212f878ebd6e4e3018d44cb6233d224219a39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiosignal \
python39-aiosignal \
python3dist-aiosignal"

RDEPENDS:${PN} += "python-abi \
python39-frozenlist"

inherit rpm
