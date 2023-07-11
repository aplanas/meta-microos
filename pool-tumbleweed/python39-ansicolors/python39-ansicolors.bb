SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python39-ansicolors-1.1.8-3.16.noarch.rpm"
RPM_HASH = "569a5272ef0a6da4e02623d43572c621183638c01804fc5811655d34ec1b5c6555d2e7e4579911059e4effc8254899fddeef2d9077581c31491fb38b46f221b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ansicolors \
python39-ansicolors \
python3dist-ansicolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
