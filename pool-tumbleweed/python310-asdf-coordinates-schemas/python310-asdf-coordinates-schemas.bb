SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-asdf-coordinates-schemas-0.1.0-1.9.noarch.rpm"
RPM_HASH = "365b9b54002db640bb6c4fe199e64da0a7cc0015118e331134a201a965beeb981355ba0ef2db908bff41c7e79416777cafa3d92a932306bfa9bad6f05d0fea65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-coordinates-schemas \
python310-asdf-coordinates-schemas \
python3dist-asdf-coordinates-schemas"

RDEPENDS:${PN} += "python-abi \
python310-asdf"

inherit rpm
