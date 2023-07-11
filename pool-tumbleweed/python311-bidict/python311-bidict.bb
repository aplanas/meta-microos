SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.22.1"

RPM_NAME = "python311-bidict-0.22.1-1.3.noarch.rpm"
RPM_HASH = "3faed275c1bcecadd9f51833db4d390c0711cd68b9edde7590303af491b3b56d6bae96a86351b0edebfdf7820841688103a78d6c6df1e3d47a8a436564df281f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bidict \
python3.11dist-bidict \
python311-bidict \
python3dist-bidict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
