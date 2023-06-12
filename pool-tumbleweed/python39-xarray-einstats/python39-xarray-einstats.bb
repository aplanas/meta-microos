SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-xarray-einstats-0.5.1-1.1.noarch.rpm"
RPM_HASH = "71ebc02ebfc7f318c5aae1fe1782c840782def2b2b71616f9c82001d55018b77fd3fa84a233723a177e48166e1a9ff5bd12ec61a9c962d5c5e9c0838af69c5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xarray-einstats) \
python39-xarray-einstats \
python3dist(xarray-einstats)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-scipy \
python39-xarray"

inherit rpm
