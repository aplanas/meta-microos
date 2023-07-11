SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python39-libtmux-0.22.1-1.3.noarch.rpm"
RPM_HASH = "bc2f264d77ea9222ca4022c44b9386a0450ada39c9aee941a9c74baa60f5f046f91f7a21d5b6caaf4afdda76209f24774d80c395412cb3b54b9cc65ab8bbe5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libtmux \
python39-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
