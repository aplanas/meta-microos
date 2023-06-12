SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python39-vcver-0.2.12-1.3.noarch.rpm"
RPM_HASH = "b80e5f5ddea98d283bd3f4f6a0517e2954e8370ba209146f0fe5c3bb52a59db77c27a5d47e34d2244fc579a77dff27d6827aa9ae11fe7ddeda6ec83b319c37f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vcver) \
python39-vcver \
python3dist(vcver)"
RDEPENDS:${PN} += "python(abi) \
python39-packaging"

inherit rpm
