SUMMARY = "Allows you to create and view interactive cheatsheets on the command-line"
DESCRIPTION = "cheat allows you to create and view interactive cheatsheets on the command-line. It was designed to help remind *nix system administrators of options for commands that they use frequently, but not frequently enough to remember."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "cheat-4.4.0-1.5.aarch64.rpm"
RPM_HASH = "861b09c432d5484b6d9a737bad18e5eec222b8e26054608fa9001a23c205e53dacf4a991754ab6af3e85c817e19fc9d3c5e34c2bf19c8a8ef0dacd5c898e25a6"

RPROVIDES:${PN} += "cheat"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
