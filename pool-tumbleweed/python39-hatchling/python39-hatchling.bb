SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.18.0"

RPM_NAME = "python39-hatchling-1.18.0-1.1.noarch.rpm"
RPM_HASH = "608fe3692e442cc6947bf32e429c9540e599d606503a3da4161d1e7311e14269f2d53696a2b4b9bf2d04ef33639b6cb0f781d3d7d9f2f62565e1b3f126dcdcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatchling \
python39-hatchling \
python3dist-hatchling"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-editables \
python39-packaging \
python39-pathspec \
python39-pluggy \
python39-tomli \
python39-trove-classifiers \
update-alternatives"

inherit rpm
