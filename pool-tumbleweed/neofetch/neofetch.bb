SUMMARY = "CLI system information tool written in BASH"
DESCRIPTION = "Displays information about the system next to an image, the OS logo, or any \
ASCII file of choice. The main purpose of Neofetch is to be used in \
screenshots to show other users what OS/Distro is running, what Theme/Icons \
are being used, etc. \
 \
Customizable through the use of command line flags or the user config file. \
There are over 50 config options to mess around with and there's the `print_info() \
function and friends which let you add your own custom info."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "neofetch-7.1.0-2.1.noarch.rpm"
RPM_HASH = "be94536d32afbe20e25705c02453701587157aff8deecbfb771ae1ebf83219d5ee7046e1325ef5fe2bfa3d166125c4b99fdeb77bf316e444be27e26839ce0226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neofetch"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
