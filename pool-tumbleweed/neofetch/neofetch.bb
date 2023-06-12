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

RPM_NAME = "neofetch-7.1.0-1.9.noarch.rpm"
RPM_HASH = "d9ff03ec76dba183651f5c01e47fb23355ec47ceaca9c7acad1867c5dc4ca68e9c755b3125918f70fb5c414130d7de6ebea425f8dc353fb5142095990992e9af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neofetch"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
