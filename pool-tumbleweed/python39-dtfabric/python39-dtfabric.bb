SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python39-dtfabric-20221218-2.1.noarch.rpm"
RPM_HASH = "8a58291bdf771eae7ab8448493ebb6cd25ac68db97c379a3efe228ff909208c3f01946f1df2a8e7d5c15e39dfd8a9e29e4d4e8dedc0fc704944620da26352066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dtfabric \
python39-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
update-alternatives"

inherit rpm
