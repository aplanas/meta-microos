SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python310-chest-0.2.3-4.8.noarch.rpm"
RPM_HASH = "dd2cdbda88e7ff6240a8b92520795fdb689ba902dd81c513c6a368a8d97231fe4bdaf3353b20d90af4f3547d1bb4137e8ad8cd3a2d712c48594e0f13f4784649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-chest \
python310-chest \
python3dist-chest"

RDEPENDS:${PN} += "python-abi \
python310-HeapDict"

inherit rpm
