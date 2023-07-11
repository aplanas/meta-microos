SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python311-aniso8601-9.0.1-2.3.noarch.rpm"
RPM_HASH = "774fbdb67d70a90445612fc4a36624702d15b0026857fb3ac15773f35eea59b579eefb735efb8e674a19e0459b209bd017e31f0654f97428b0fd9656512971ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aniso8601 \
python3.11dist-aniso8601 \
python311-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
