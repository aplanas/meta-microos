SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command and control tmux servers, sessions, windows, and panes. It is the tool powering tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python311-libtmux-0.22.1-1.3.noarch.rpm"
RPM_HASH = "6bc429dfd5258bbb5bce166459bb5794681f884db34459482a759bf9de27894f9869cb1f9d0bfb1f36a9dd57892686e3ee53a6c845e2a93370922538cddcc49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libtmux \
python3.11dist-libtmux \
python311-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
