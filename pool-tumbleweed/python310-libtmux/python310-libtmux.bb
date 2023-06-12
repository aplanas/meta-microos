SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python310-libtmux-0.22.1-1.1.noarch.rpm"
RPM_HASH = "9919716c3fbf7acabc1fdac41b1d60c8a43751c64d8ee8cf868d6b6d5e4bd824525e8561c853446c87ec220435b21e52c7436361ec060cbe0fa682601020c24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libtmux \
python3.10dist(libtmux) \
python310-libtmux \
python3dist(libtmux)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
