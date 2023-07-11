SUMMARY = "Python functions for working with deeply nested documents (lists and dicts)"
DESCRIPTION = "Python functions for working with deeply nested documents (lists and dicts)"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.25"

RPM_NAME = "python311-nested-lookup-0.2.25-1.4.noarch.rpm"
RPM_HASH = "299929a236fe28f16392d4d4eda320f85f381ee28eb43344d460965db42a31afbccc6ad5eeb3ec1b4917680570bdda81ed42d761b1f55f4ebb254e4df115a393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nested-lookup \
python3.11dist-nested-lookup \
python311-nested-lookup \
python3dist-nested-lookup"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
