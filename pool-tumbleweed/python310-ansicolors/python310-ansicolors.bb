SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python310-ansicolors-1.1.8-3.16.noarch.rpm"
RPM_HASH = "74a2b4b83d4e7c24c44cf9ba611a313e0e1fc4f399d660e6cdd4fd6bda8a787b0fac78eb5d7f5ac2ab686c4bba8607ada72384cbc685e06021634c44b3ed2ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ansicolors \
python310-ansicolors \
python3dist-ansicolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
