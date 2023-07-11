SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.17.1"

RPM_NAME = "python39-fastjsonschema-2.17.1-1.3.noarch.rpm"
RPM_HASH = "db1d593df9700d4197c24dfb4b0a241335e22305927262f2929beab360b5a03984531eff428f4a7ce8afc710885a24a00d5048c59b1fdb50d8eaa0fc49e0ef9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fastjsonschema \
python39-fastjsonschema \
python3dist-fastjsonschema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
