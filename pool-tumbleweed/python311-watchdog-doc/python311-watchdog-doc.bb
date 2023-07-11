SUMMARY = "Documentation and examples for python311-watchdog"
DESCRIPTION = "This package contains documentation and examples for python311-watchdog."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-watchdog-doc-3.0.0-2.3.noarch.rpm"
RPM_HASH = "1e40ecfc348ab88a1503e815bec02520b3e04c66162b72afe1675725678b3ae6c7220f802f35d1c10de6cc5bc317e237ba05d60171cb795f16ef90e9c2a58b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-watchdog-doc \
python311-watchdog-doc"

RDEPENDS:${PN} += ""

inherit rpm
