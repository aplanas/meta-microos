SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python310-libtmux-0.23.1-1.1.noarch.rpm"
RPM_HASH = "f2ad914cbd4efe44f06e6468c091284c2176330dc9d0d5f220d1b0b2d5a68d626bb679fbcd2a1d5ba0e82af63961104509cf7b3b8881a8da46cf4841e993c517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libtmux \
python310-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
