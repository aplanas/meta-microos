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

PV = "1.1.29"

RPM_NAME = "python39-configshell-fb-1.1.29-2.1.noarch.rpm"
RPM_HASH = "7025d956383d0a8e190a7fa29d1d8b2770fc8b7873dec93dd6011654e67f1ccd4c29054342017eee9a334092bf12680163d931c609663b4fcb25447a08b19dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(configshell-fb) \
python39-configshell \
python39-configshell-fb \
python3dist(configshell-fb)"
RDEPENDS:${PN} += "/usr/bin/env \
python(abi) \
python39-pyparsing \
python39-six \
python39-urwid"

inherit rpm
