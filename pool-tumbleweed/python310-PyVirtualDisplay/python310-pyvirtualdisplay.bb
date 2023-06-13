SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python310-PyVirtualDisplay-3.0-2.2.noarch.rpm"
RPM_HASH = "3a41a431de1fb8f06b6cb8a1d000d43a1c94125b39015c6fc2ce08787c377fabb6be631ca77317ec206ea6f6660bfa6d2344659a61a336b3fcf0fcd59749ab48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyVirtualDisplay \
python3.10dist(pyvirtualdisplay) \
python310-PyVirtualDisplay \
python3dist(pyvirtualdisplay)"

RDEPENDS:${PN} += "python(abi) \
python310-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
