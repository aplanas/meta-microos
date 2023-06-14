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

RPM_NAME = "python310-configshell-fb-1.1.29-2.1.noarch.rpm"
RPM_HASH = "668d260953ca0113466f35699f1bf74938645ccabc305c51c7fd4fca16f41af468a54bd9eb88cb7db6a95bf06aaabf64a49bd017531fcf3437607d921e295a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-configshell \
python3-configshell-fb \
python3.10dist-configshell-fb \
python310-configshell \
python310-configshell-fb \
python3dist-configshell-fb"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python310-pyparsing \
python310-six \
python310-urwid"

inherit rpm
