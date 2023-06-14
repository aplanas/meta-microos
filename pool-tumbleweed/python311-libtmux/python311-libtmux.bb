SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python311-libtmux-0.22.1-1.1.noarch.rpm"
RPM_HASH = "0b84c58b4b97303a9a94d633f61c1eb1feb98638515162bccda3dec62b67d5c461f375a57d7977e05e206ce9dc0c298b81cab4bd0dd235efd32349aca898575a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-libtmux \
python311-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
