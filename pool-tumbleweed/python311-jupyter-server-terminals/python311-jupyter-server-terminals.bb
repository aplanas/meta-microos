SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-jupyter-server-terminals-0.4.4-1.3.noarch.rpm"
RPM_HASH = "261df5ba4a4e3f96f8833effce128cdea453b226ed50e32d3185033a96ad103158faae241392d8392f73b746f59634b2289c397ef5eb8f300b63011637cd2e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-server-terminals \
python311-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python311-terminado"

inherit rpm
