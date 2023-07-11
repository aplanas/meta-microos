SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python311-uniseg-0.7.2-1.4.noarch.rpm"
RPM_HASH = "816c47b192c03b50f72b01c059643e87ee8951515ea4ad20b5716c68ee609b19a725c8ee144589bfb90cf9d4ba63ffb56b4f8d29c4d5b451d08c1c25f86f8d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uniseg \
python3.11dist-uniseg \
python311-uniseg \
python3dist-uniseg"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
