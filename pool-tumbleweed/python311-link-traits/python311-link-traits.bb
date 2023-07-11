SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-link-traits-1.0.3-1.13.noarch.rpm"
RPM_HASH = "77351f4d611df67a9e326d52ed15b206707e9a5424a80218f9b6e903d759308e82e8af64db88818e9be9b6174c37af0362e01b38bea70c9228dd25deb3e2f955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-link-traits \
python3.11dist-link-traits \
python311-link-traits \
python3dist-link-traits"

RDEPENDS:${PN} += "python-abi \
python311-traits"

inherit rpm
