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

RPM_NAME = "python311-configshell-fb-1.1.30-1.1.noarch.rpm"
RPM_HASH = "c9f85367f7879923c877026f6450a5a6139298a6f19ed1bd12829a207615cfdfa807b5ac60aeefe89e0d1d9f18a3acce5e3dc06a8c6812b266be3a65df3f7ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-configshell \
python3-configshell-fb \
python3.11dist-configshell-fb \
python311-configshell \
python311-configshell-fb \
python3dist-configshell-fb"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python311-pyparsing \
python311-six \
python311-urwid"

inherit rpm
