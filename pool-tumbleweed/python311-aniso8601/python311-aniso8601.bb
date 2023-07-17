SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python311-aniso8601-9.0.1-3.1.noarch.rpm"
RPM_HASH = "78c0c4614e0a722fe23851928036dd08c2b5ea1e9b865c553a051bc78f02b42ec82fbd02d3a4252c398cbb0eec9c567d5f7c68181afe58d4a9cca65ca8f70c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aniso8601 \
python3.11dist-aniso8601 \
python311-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
