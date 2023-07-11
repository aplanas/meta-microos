SUMMARY = "Git revision tree visualiser"
DESCRIPTION = "Grapical tool for visualization of revision trees of projects \
maintained in the Git version control system. It name gitk indicates \
that it's written using the Tk Widget set. \
 \
A simple Tk based graphical interface for common Git operations is \
found in the package git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "gitk-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "4230e600d6fc34cae6e95ed709ff9bf3ba71fa3c8276caa814b13e01b69514f623c6e76aaecc474dfc606fe44c2ecf97bbe2e364484b13d1a5c90cbf4e2caf92"

RPROVIDES:${PN} += "gitk"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm
