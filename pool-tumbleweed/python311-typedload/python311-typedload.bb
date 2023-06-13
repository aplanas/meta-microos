SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.19"

RPM_NAME = "python311-typedload-2.19-1.3.noarch.rpm"
RPM_HASH = "a86e0bc40ff5b9034f23d687d73ef8189c22ea57444c216ffa9fe03b0f111f65efe063683c3a74ffb0412e2b131c65f03276928fdf461ec0bf574b238a59b8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(typedload) \
python311-typedload \
python3dist(typedload)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
