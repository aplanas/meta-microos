SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-pick-2.2.0-2.3.noarch.rpm"
RPM_HASH = "6182f047ab45fa30eda87819f9ec2de2703f40b77ae06b4ab900777db5dacf2b173d8ee82ad4d796bdaf56aa1dd2b6a2d0e104289673caa8a35f619a844da8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pick \
python3.11dist-pick \
python311-pick \
python3dist-pick"

RDEPENDS:${PN} += "python-abi"

inherit rpm
