SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python311-chest-0.2.3-4.8.noarch.rpm"
RPM_HASH = "bd0f8146c9f3775eba993b03987d66bb1f769f54616640b48c9c1f7e87be50ff81d1d16c07e2fa0ad4603b116cbefba8a18246835995b81136cf0d544989aca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chest \
python3.11dist-chest \
python311-chest \
python3dist-chest"

RDEPENDS:${PN} += "python-abi \
python311-HeapDict"

inherit rpm
