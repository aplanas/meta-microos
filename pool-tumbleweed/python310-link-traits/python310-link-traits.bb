SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-link-traits-1.0.3-1.13.noarch.rpm"
RPM_HASH = "f02301138cb7fbf1ab997e83901b40e259cd5eeeb344cf54454dfa67457c57f63aa647bf2790e89cca59ac263e5795e9692135fbbb708b626fea1fb66a82b9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-link-traits \
python310-link-traits \
python3dist-link-traits"

RDEPENDS:${PN} += "python-abi \
python310-traits"

inherit rpm
