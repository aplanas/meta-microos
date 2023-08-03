SUMMARY = "XDG terminal execution utility and default terminal specification"
DESCRIPTION = "Utility for XDG terminal execution and defining a systems default graphical terminal emulator."
LICENSE = "GPL-3.0-or-later"

PV = "20230731+git.6426085"

RPM_NAME = "xdg-terminal-exec-20230731+git.6426085-1.1.aarch64.rpm"
RPM_HASH = "8b09987cd866ac273faeba92c00d4756cc3f7c8c4d279d11d95ba8dbad4e273ccc7437851b8cf5e9af81cb4070ef9e8a5a0e32da12ce48395e114c35f6705d0d"

RPROVIDES:${PN} += "xdg-terminal-exec"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
