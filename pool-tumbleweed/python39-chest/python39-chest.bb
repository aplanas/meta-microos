SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python39-chest-0.2.3-4.6.noarch.rpm"
RPM_HASH = "816176f246275ae7f414e51d1cc01f916bfde9f39305ef9f7a22ab7548d5a86bf73cbc39b70e5707b8cd74235ff195cd217eb112d1305b89d29a6737ab3533ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(chest) \
python39-chest \
python3dist(chest)"
RDEPENDS:${PN} += "python(abi) \
python39-HeapDict"

inherit rpm
