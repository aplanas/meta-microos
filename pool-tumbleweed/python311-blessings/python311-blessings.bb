SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-blessings-1.7-3.1.noarch.rpm"
RPM_HASH = "14307598d65f5a03f448fe57d4e3077c397e4ba213d26b23e06e4115981511d7b13e6879e83361fa3e2d94348cd8e1dfa26440cf6e5d35ffdc96b825b4aaa658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-blessings \
python311-blessings \
python3dist-blessings"

RDEPENDS:${PN} += "python-abi \
python311-curses \
python311-six"

inherit rpm
