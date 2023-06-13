SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-PyNamecheap-0.0.3-2.14.noarch.rpm"
RPM_HASH = "0bb48bc2614532578ce6fe8bec3c2d50554c427da2be493e9b9b1cdcaeebdb1e98a8602ab4efdc5392477dd8239678c3c8979dc316c5e924a6caf8e999eb1e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pynamecheap) \
python311-PyNamecheap \
python3dist(pynamecheap)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
