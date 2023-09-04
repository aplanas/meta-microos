SUMMARY = "Git revision tree visualiser"
DESCRIPTION = "Grapical tool for visualization of revision trees of projects \
maintained in the Git version control system. It name gitk indicates \
that it's written using the Tk Widget set. \
 \
A simple Tk based graphical interface for common Git operations is \
found in the package git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "gitk-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "e12e4db7649e3a0b88bbabbe9d5e2ec2c54770231776107fcfc380c63f9dd20eecd4920e1b67aa9c9ca539d8bf70858a3cfed89d8bb3df4d47c7de7a44985d6a"

RPROVIDES:${PN} += "gitk"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm
