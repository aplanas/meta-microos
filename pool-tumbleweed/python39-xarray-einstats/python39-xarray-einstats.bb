SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-xarray-einstats-0.5.1-1.3.noarch.rpm"
RPM_HASH = "6572a5f141b6393d438ee99dc75304548e70bbc380c1902e20cef941fe4147e41001f90a27567ec9790696a685cf99a876e61834be0416c49f2e6a866ea720c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xarray-einstats \
python39-xarray-einstats \
python3dist-xarray-einstats"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy \
python39-xarray"

inherit rpm
