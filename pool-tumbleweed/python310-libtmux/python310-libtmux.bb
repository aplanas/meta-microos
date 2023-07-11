SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python310-libtmux-0.22.1-1.3.noarch.rpm"
RPM_HASH = "3824ce434f7f882a16bbc65cf92e8e9ec436e0faeb63a9c45479aef5584840833a0c44d8f6bd8399ba365ae293503b714ab22dd0bcdea2a3d3e6f3ebf66d4cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libtmux \
python310-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
