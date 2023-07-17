SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python310-aniso8601-9.0.1-3.1.noarch.rpm"
RPM_HASH = "78333946764abff822a35a6be86da89fcd812944d90f7ec1acbbbeaf9773b34da14caa929e39801eb2fdc0a9a2a976efb5f2e0ed7a44b8ed75f54205d34f1c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aniso8601 \
python310-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
