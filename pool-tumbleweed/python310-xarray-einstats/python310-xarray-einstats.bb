SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-xarray-einstats-0.5.1-1.3.noarch.rpm"
RPM_HASH = "231e79ac09fb433412571cfbbca58560615b65c2be21f36ea0f7b1349f1d135f52cdd0ee58e954b2ea4a9ecfaebccfc14f6a4a31cf0041ce311d9520f20aa4bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xarray-einstats \
python310-xarray-einstats \
python3dist-xarray-einstats"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy \
python310-xarray"

inherit rpm
