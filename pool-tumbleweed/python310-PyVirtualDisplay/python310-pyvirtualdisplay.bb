SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python310-PyVirtualDisplay-3.0-4.1.noarch.rpm"
RPM_HASH = "ae034e8449e5b67e50e104dad9274fcae30ecd409c9ad7c4517aff88d42bcdb2a8e7d89b7fbb381e7a92476ebfc2226f3835253080a47f6f0951e2778945a93f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyvirtualdisplay \
python310-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python310-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
