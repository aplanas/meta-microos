SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python310-dtfabric-20221218-1.4.noarch.rpm"
RPM_HASH = "3ecd44210a588cb25de430831d109656a0e1cd68d034fbea2efd5f829269c523e8b7ff8751e2d6f6b2b33e5674da46698cea46579dc240d09fa521a26bf05e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dtfabric \
python3.10dist-dtfabric \
python310-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
