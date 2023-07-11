SUMMARY = "Parallel asyncio Python setup(cfg|py) test runner"
DESCRIPTION = "Parallel asyncio Python setup.(cfg|py) test runner."
LICENSE = "MIT"

PV = "20.2.26"

RPM_NAME = "python310-ptr-20.2.26-3.13.noarch.rpm"
RPM_HASH = "e9b06f8e34e5af3d92cf69e56d54bd4a4107008e215de6b47867d1701f299c920ec171e70cc7576743eba026411e8593d1367d418f323a4f7540f33d1cc06246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ptr \
python310-ptr \
python3dist-ptr"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
