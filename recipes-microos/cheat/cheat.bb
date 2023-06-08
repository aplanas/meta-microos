SUMMARY = "Allows you to create and view interactive cheatsheets on the command-line"
DESCRIPTION = "cheat allows you to create and view interactive cheatsheets on the command-line. It was designed to help remind *nix system administrators of options for commands that they use frequently, but not frequently enough to remember."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "cheat-4.4.0-1.3.aarch64.rpm"
RPM_HASH = "c702ed2a43cd832d9df60661c75b7b8deb0162b3cea3d7836415fd4ed260394fc7b4866c401d7200f48cbd80945598da6b89fdbc324322730ec288e65784b2c9"

RPROVIDES:${PN} += "cheat cheat(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
