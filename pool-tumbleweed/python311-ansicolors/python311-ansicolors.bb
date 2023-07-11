SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python311-ansicolors-1.1.8-3.16.noarch.rpm"
RPM_HASH = "88ce36d3016e9d8ac4c09353f88a21bb946b00db48925aaca021bb677be5a5b14b838cc172cbb71543c031945a7705e6f53a75a0ce504531b3a4602732db42f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansicolors \
python3.11dist-ansicolors \
python311-ansicolors \
python3dist-ansicolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
