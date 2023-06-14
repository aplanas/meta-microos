SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.1"

RPM_NAME = "python311-orderedmultidict-1.0.1-3.1.noarch.rpm"
RPM_HASH = "2e1823b9da7c7749b73b46844a085934fd95931e3efb4d405fc6bf6f8bfd916d31e083e32eecba821bf43f5cf3e77a343498d6034eca523a0d5411db3a45e5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-orderedmultidict \
python311-orderedmultidict \
python3dist-orderedmultidict"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
