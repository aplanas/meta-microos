SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python39-chest-0.2.3-4.8.noarch.rpm"
RPM_HASH = "527f3e3c1ac07ac45c52e2074d66703d166ad744c2851bfe3948d8ed6da0442ebb21f7ffb747f5c339c156d8afaf3927ce401724a622534c023ff37ce1f83ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-chest \
python39-chest \
python3dist-chest"

RDEPENDS:${PN} += "python-abi \
python39-HeapDict"

inherit rpm
