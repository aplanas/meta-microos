SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python310-dtfabric-20221218-2.1.noarch.rpm"
RPM_HASH = "6e1f3b72d95c54988214bbff53ddeae4c7cc00e0368014c169e17f5452658668209649149b71695870445982a61b21cbb6d1512df6551ce6eca6346a57a340e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dtfabric \
python310-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
update-alternatives"

inherit rpm
