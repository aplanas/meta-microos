SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python311-traittypes-0.2.1-9.4.noarch.rpm"
RPM_HASH = "70ed85e8c3c7c4748c93743e56ff8ae5038acbcbea13c6276fad7ec02a95c9fca4c6d5d9ecefec119eec6dbe6eeda1792835760881973c73471eb5b4c5ae9d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traittypes \
python3.11dist-traittypes \
python311-traittypes \
python3dist-traittypes"

RDEPENDS:${PN} += "python-abi \
python311-traitlets"

inherit rpm
