SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python310-yamale-4.0.4-2.3.noarch.rpm"
RPM_HASH = "a0d9b62e22c4793f9a910e5f47e33d571f5a1c085cdebba823c1aca711e882f06f8ca8fde157c5247fdfab585c63d878ce2624a0edbd01ed61ba79c0c54d719e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yamale \
python310-yamale \
python3dist-yamale"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
