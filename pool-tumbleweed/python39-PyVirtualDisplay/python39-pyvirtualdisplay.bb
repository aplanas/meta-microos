SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python39-PyVirtualDisplay-3.0-2.2.noarch.rpm"
RPM_HASH = "e6fbbbc5a499eca30c7c40564dc70dd262a16ea2db24cacf469b9e6c325c3de2f478aef962b5c2bcc44624c071aac30620b0278a32bc7e11810117604f919562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyvirtualdisplay) \
python39-PyVirtualDisplay \
python3dist(pyvirtualdisplay)"

RDEPENDS:${PN} += "python(abi) \
python39-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
