SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python311-dtfabric-20221218-1.5.noarch.rpm"
RPM_HASH = "60af7b3adfa0dc3b04146eb9b4f2ac304f0986a7a8dbe455b0f637e0b58267ce42c73c9ad909d1c904af36a973759ad387ed7df8400ad21f451b6980d3c8d8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dtfabric \
python3.11dist-dtfabric \
python311-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
