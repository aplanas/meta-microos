SUMMARY = "Set environment and terminal settings to current window size"
DESCRIPTION = "Prints a shell command for setting the appropriate environment variables to \
indicate the current size of the window from which the command is run."
LICENSE = "MIT"

PV = "382"

RPM_NAME = "xterm-resize-382-1.1.aarch64.rpm"
RPM_HASH = "662d969d96392061787146a915f0a565b7bff053da45821cae1bf410d9da61cd57e31573e062280cfd7776340b74428dcdfd230dc1386988b9aefb1b380265fe"

RPROVIDES:${PN} += "xterm-resize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
