SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20221218"

RPM_NAME = "python311-dtfabric-20221218-1.4.noarch.rpm"
RPM_HASH = "800c96cb3db53d8130e19e1544e009be5c6316ec6b086f01eccfa4d525fd473e71013235fa824dac9138b35ea48d1d8c9b8e94d4c4d88b84f87f7ee85980ec17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dtfabric \
python311-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
