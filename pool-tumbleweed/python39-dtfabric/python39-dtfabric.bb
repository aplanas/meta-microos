SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python39-dtfabric-20221218-1.5.noarch.rpm"
RPM_HASH = "2b28a3028d96e18c9b1ce951e2d73f28b653b8f11892544fdc25bcbffca7450b048d9bec12431993cd7a3d697f4c2265e668dbf6be4561fdf6e1e87ce042ecca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dtfabric \
python39-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
