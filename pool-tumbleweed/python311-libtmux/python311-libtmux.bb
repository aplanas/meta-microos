SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python311-libtmux-0.23.1-1.1.noarch.rpm"
RPM_HASH = "4d440de22209026c4f6818f3598fb52e7b85e674c526b6a30c99b035b326b55468e0ee507dda1114ef13426d714aafff5fba2f579f255573d4353a3b5433d185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libtmux \
python3.11dist-libtmux \
python311-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
