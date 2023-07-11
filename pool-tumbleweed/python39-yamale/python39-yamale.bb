SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python39-yamale-4.0.4-2.3.noarch.rpm"
RPM_HASH = "0995eecd024ed61c63af1339af66a9da243539eb3391d606ffa6cdc298f400e83d4dab7ece4c0cb1c723307347b7cc0cfe5d076d4c78946a1be697f28432f2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yamale \
python39-yamale \
python3dist-yamale"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
