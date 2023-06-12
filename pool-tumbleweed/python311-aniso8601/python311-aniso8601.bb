SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python311-aniso8601-9.0.1-2.1.noarch.rpm"
RPM_HASH = "43d5e53b7f4d7650d486f32004a3dd684842eb948d51a9090cd03d0e222ef5ac452757e0bb2c9205b4cc46afd3f977086792742745f88942f8149edb0b4a4819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aniso8601) \
python311-aniso8601 \
python3dist(aniso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
