SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python310-traittypes-0.2.1-9.4.noarch.rpm"
RPM_HASH = "e112f8a06ca12e3f718ce9f32d1214873c76f2a99ebcfd3640024b691f45a921709b2797077254ed7e31e4d23718ecff5c63ccbc8a0c04506d76821a56c836d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-traittypes \
python310-traittypes \
python3dist-traittypes"

RDEPENDS:${PN} += "python-abi \
python310-traitlets"

inherit rpm
