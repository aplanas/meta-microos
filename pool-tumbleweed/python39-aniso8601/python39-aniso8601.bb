SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python39-aniso8601-9.0.1-2.1.noarch.rpm"
RPM_HASH = "43cc11ec6e5be47c27e77cb1e097f9c056bbaf50da510c43a2a8b504ba1e5a334ecd0e55b1730f83a2f3d81af17989e1bcfffe31e2b5ce5adbad2b133ec6b92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aniso8601) \
python39-aniso8601 \
python3dist(aniso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
