SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.0"

RPM_NAME = "python39-shellingham-1.5.0-2.1.noarch.rpm"
RPM_HASH = "519352a63afcd64f783121f518290dc9a57ad87e78e4de1030797ada2f0cdab021ffada6aad23311435ddb6ae46052ab0263eea21d968090fdd439c1e8e9a83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shellingham \
python39-shellingham \
python3dist-shellingham"

RDEPENDS:${PN} += "python-abi"

inherit rpm
