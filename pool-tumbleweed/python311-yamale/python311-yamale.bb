SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python311-yamale-4.0.4-2.1.noarch.rpm"
RPM_HASH = "417eeb9af2cf47802e0933647eabb09249c531eedfbd5a2ad96fd46692f502506fd4b235e67d406aef3997bd03eb2cf49e7824414f3f60f3f8bcf8ec6b1e297e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yamale) \
python311-yamale \
python3dist(yamale)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
