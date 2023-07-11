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

RPM_NAME = "python310-configshell-fb-1.1.30-1.1.noarch.rpm"
RPM_HASH = "be70ba15c38ab30cbb22a4f2c6a3ba30e969fc38cd1b66c71882199c2a72f703432f11fe066243cf392cf2e926da1f88984901f9204e8bd893a79ebd1d96592f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-configshell-fb \
python310-configshell \
python310-configshell-fb \
python3dist-configshell-fb"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python310-pyparsing \
python310-six \
python310-urwid"

inherit rpm
