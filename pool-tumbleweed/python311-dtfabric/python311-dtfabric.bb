SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python311-dtfabric-20221218-2.1.noarch.rpm"
RPM_HASH = "bb7e60ed9196cb647dde47d76fc673b97c41995b5aac5dd1533e8e3b15225cade243885fbb1c90a6af5b780f553812aa4ee6d68ceba7c335bde312e7566219cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dtfabric \
python3.11dist-dtfabric \
python311-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
update-alternatives"

inherit rpm
