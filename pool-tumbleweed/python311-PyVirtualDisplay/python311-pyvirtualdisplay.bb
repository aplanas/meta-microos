SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python311-PyVirtualDisplay-3.0-3.2.noarch.rpm"
RPM_HASH = "dd6ad7796dcd6f03df6e151a53bb8e0214ac1db2b64c6eea767e800cd4c14bbdb4147690667b92850b71912b9285d6b25e8ed55445107060f4172be7ddb041e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyVirtualDisplay \
python3.11dist-pyvirtualdisplay \
python311-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python311-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
