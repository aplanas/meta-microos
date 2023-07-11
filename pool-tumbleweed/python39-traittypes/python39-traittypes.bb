SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-traittypes-0.2.1-9.4.noarch.rpm"
RPM_HASH = "3c4b70d110e2465deb6e514dc5679df01cf14021b169d913e91023808e350c15bb04622c1e0af7e412738fc077ef50b62ad21e325decc4599957fb38d4fb5d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-traittypes \
python39-traittypes \
python3dist-traittypes"

RDEPENDS:${PN} += "python-abi \
python39-traitlets"

inherit rpm
