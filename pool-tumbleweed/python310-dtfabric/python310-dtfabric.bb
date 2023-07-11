SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python310-dtfabric-20221218-1.5.noarch.rpm"
RPM_HASH = "8f9c986483061740767f6a55e8569aa808a101aeaf9f09cf21c2cf2fa9216614e583990faa3f5078ec542b83daf6a534a1158b0b0050d601c977e0f01041fdea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dtfabric \
python310-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
