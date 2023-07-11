SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0"

PV = "1.7.6"

RPM_NAME = "python311-pynput-1.7.6-1.2.noarch.rpm"
RPM_HASH = "2ec59dfd8d9a6f994aabd5fb9c73fb22e603f4a353a2f3aa33468dc754d6c721a604879eaf17b26d2e5ce661c29381fc9e8876283c3d3119c464e0307ac05bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynput \
python3.11dist-pynput \
python311-pynput \
python3dist-pynput"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
