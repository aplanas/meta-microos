SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python310-yamale-4.0.4-2.1.noarch.rpm"
RPM_HASH = "92ab4d16f0b2a9043c5c857be145f2229aed0210938abb9930acc43b54a4d5ec494bb6cff76f0a9bb6626211fc8bf42b96aa40453caee754f62074648ded674c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamale \
python3.10dist-yamale \
python310-yamale \
python3dist-yamale"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
