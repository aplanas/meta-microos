SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-click-man-0.4.1-1.17.noarch.rpm"
RPM_HASH = "b85d67487789c89e87ec4a51187b1756fda7b767e252ade47435f031246d59dc479a6b37c5a2f71dae72ecb5eec331df3b05937dbc8e26b6110deb954bb7b90f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-man \
python3.11dist-click-man \
python311-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click"

inherit rpm
