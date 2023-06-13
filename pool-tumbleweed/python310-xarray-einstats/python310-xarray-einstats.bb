SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-xarray-einstats-0.5.1-1.1.noarch.rpm"
RPM_HASH = "b6ec624221b6998747e4d48683c34213d8f1517a787b0160918eaccbbaeb1ebff28df9a774215355d3996555439dfa3d164d1d02a75546851c3732526dde9146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-einstats \
python3.10dist(xarray-einstats) \
python310-xarray-einstats \
python3dist(xarray-einstats)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-scipy \
python310-xarray"

inherit rpm
