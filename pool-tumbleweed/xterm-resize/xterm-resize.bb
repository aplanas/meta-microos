SUMMARY = "Set environment and terminal settings to current window size"
DESCRIPTION = "Prints a shell command for setting the appropriate environment variables to \
indicate the current size of the window from which the command is run."
LICENSE = "MIT"

PV = "384"

RPM_NAME = "xterm-resize-384-1.1.aarch64.rpm"
RPM_HASH = "53b97429a1ad9f22e1f4732dbd90fd3b9ca4db19eb79fa4155d09176b51523c85ebea21697d7a9f48962b995884ee99e97590ee5be1b27218e60b03ca2f8ae50"

RPROVIDES:${PN} += "xterm-resize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
