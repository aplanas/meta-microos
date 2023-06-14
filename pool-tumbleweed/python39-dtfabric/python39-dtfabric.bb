SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python39-dtfabric-20221218-1.4.noarch.rpm"
RPM_HASH = "739c23010ea1d57c3271f1ba4343eedd84096b5bb3d1680893b3c1081146099853213808ebc91d770f1a66ea3d8097529a8662173b18afe3f9afc5c9c27860de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dtfabric \
python39-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
