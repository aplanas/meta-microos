SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python39-libtmux-0.23.1-1.1.noarch.rpm"
RPM_HASH = "932a08674c72e2b1c77a2d80d8bb5753a3d696cbd0500069381e9e000e44ebf19857a16194a32a45140c9458a98afcf01a4012a0d5ef085b7f128c8dbb80bb9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libtmux \
python39-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
