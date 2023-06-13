SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python311-chest-0.2.3-4.6.noarch.rpm"
RPM_HASH = "6e1f9723a0df61a29f09811e3e035ddde046cb58f982318034527c8431c56b76087d4f48f6269a596baefe1876a8ad74893cd37d0a7e256e2598194b4439e71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(chest) \
python311-chest \
python3dist(chest)"

RDEPENDS:${PN} += "python(abi) \
python311-HeapDict"

inherit rpm
