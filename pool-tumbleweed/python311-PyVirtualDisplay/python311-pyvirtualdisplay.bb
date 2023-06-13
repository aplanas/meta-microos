SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python311-PyVirtualDisplay-3.0-2.2.noarch.rpm"
RPM_HASH = "d005037355154f792e1baaafac04f13010c161e820b009e1bb15bfc3e8292385eff22ef2b60f943a6852277dad3a7b53cbb5588eb4d9fbd8df5ae018f70ef4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyvirtualdisplay) \
python311-PyVirtualDisplay \
python3dist(pyvirtualdisplay)"

RDEPENDS:${PN} += "python(abi) \
python311-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
