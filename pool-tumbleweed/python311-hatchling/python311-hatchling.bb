SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.18.0"

RPM_NAME = "python311-hatchling-1.18.0-1.1.noarch.rpm"
RPM_HASH = "4dc724b039546adf0d116057760435c319b55ee793227efa661309aaa47b3c2b2eacfc44ed1124aa4ee39db85221ff440ef90934c409c8d15df9449285a017c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatchling \
python3.11dist-hatchling \
python311-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-editables \
python311-packaging \
python311-pathspec \
python311-pluggy \
python311-trove-classifiers \
update-alternatives"

inherit rpm
