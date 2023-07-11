SUMMARY = "A Python library for building configuration shells"
DESCRIPTION = "configshell-fb is a Python library that provides a framework for building simple \
but nice CLI-based applications. \
 \
configshell-fb is a fork of the 'configshell' code written by RisingTide \
Systems. The '-fb' differentiates between the original and this version. Please \
ensure to use either all 'fb' versions of the targetcli components -- targetcli, \
rtslib, and configshell, or stick with all non-fb versions, since they are \
no longer strictly compatible."
LICENSE = "Apache-2.0"

PV = "1.1.30"

RPM_NAME = "python39-configshell-fb-1.1.30-1.1.noarch.rpm"
RPM_HASH = "db9ded1f8d0b96738b32f01a18fd4d4516e6b61d07a028ca66304cc211dba09c1dc0dd4923076d7c55f119d15c52bee8d2665fed24ffff4ac9c7b40ba0cf4f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-configshell-fb \
python39-configshell \
python39-configshell-fb \
python3dist-configshell-fb"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python39-pyparsing \
python39-six \
python39-urwid"

inherit rpm
