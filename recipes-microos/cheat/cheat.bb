SUMMARY = "Allows you to create and view interactive cheatsheets on the command-line"
DESCRIPTION = "cheat allows you to create and view interactive cheatsheets on the command-line. It was designed to help remind *nix system administrators of options for commands that they use frequently, but not frequently enough to remember."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "cheat-4.4.0-1.4.aarch64.rpm"
RPM_HASH = "6b4e580ec2e763426fad035cc78e14b35cd2c3909011869ebfdef67879b957e281cedc8948d02fcd8c2fc46afbd4fe69c058f9115a0f4a7916f2cdf02b6cb46c"

RPROVIDES:${PN} += "cheat cheat(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
