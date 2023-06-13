SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python310-aniso8601-9.0.1-2.1.noarch.rpm"
RPM_HASH = "fdcb4caf47b39616f477b60b7676b81d0cc18d29b8adfe9279561daf54e50225f374ea5ccb768b94b723a013b385efa128e2609734795f07c90191ea98eac6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aniso8601 \
python3.10dist(aniso8601) \
python310-aniso8601 \
python3dist(aniso8601)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
