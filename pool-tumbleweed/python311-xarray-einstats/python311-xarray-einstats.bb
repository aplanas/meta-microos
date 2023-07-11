SUMMARY = "Stats, linear algebra and einops for xarray"
DESCRIPTION = "Stats, linear algebra and einops for xarray"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-xarray-einstats-0.5.1-1.3.noarch.rpm"
RPM_HASH = "82813300cd4e5cb956c7c19390dc31eceea110628b75653711a6c0961514f85aa1bf113d94085c4c8a594265d881d9d4f11104d7a909740cf98cf7f66dfffb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-einstats \
python3.11dist-xarray-einstats \
python311-xarray-einstats \
python3dist-xarray-einstats"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy \
python311-xarray"

inherit rpm
