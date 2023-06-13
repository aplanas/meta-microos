SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python39-yamale-4.0.4-2.1.noarch.rpm"
RPM_HASH = "3b445da396d45f28155c432b885ab829d029f8aa99a1b9663da747545013519a6bce6f84a636241d90195f2a3291a350dfaa584d4e7f5c46b85666d781c0e4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(yamale) \
python39-yamale \
python3dist(yamale)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
