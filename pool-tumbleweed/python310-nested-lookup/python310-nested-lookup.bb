SUMMARY = "Python functions for working with deeply nested documents (lists and dicts)"
DESCRIPTION = "Python functions for working with deeply nested documents (lists and dicts)"
LICENSE = "SUSE-Public-Domain"

PV = "0.2.25"

RPM_NAME = "python310-nested-lookup-0.2.25-1.4.noarch.rpm"
RPM_HASH = "7dd16397412d36dadd81ec00b5f9931c29d01d461b65e0703b3359d0c1db9a347a5af4b3ab46c6b59d4f1daedbd6b3e050900e5fa5b31df94263d272ee167cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nested-lookup \
python310-nested-lookup \
python3dist-nested-lookup"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
