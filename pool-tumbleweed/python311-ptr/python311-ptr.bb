SUMMARY = "Parallel asyncio Python setup(cfg|py) test runner"
DESCRIPTION = "Parallel asyncio Python setup.(cfg|py) test runner."
LICENSE = "MIT"

PV = "20.2.26"

RPM_NAME = "python311-ptr-20.2.26-3.13.noarch.rpm"
RPM_HASH = "19269dd6bba5b4ec734c98519ce88dcf5dbb96b4530ab708e20adb966f9300f8f560ee2ffe097c78617361b903aa6df67b88bf28dcae578e68724715d3167197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptr \
python3.11dist-ptr \
python311-ptr \
python3dist-ptr"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
