SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python310-blessings-1.7-3.3.noarch.rpm"
RPM_HASH = "b30c99f178d51c7e3dada1e2aec80fcad85f87b2afe2ec81acf50e67f3a5d3a3b2f9206bdc8264fc3fc318d6135c4d9ab779bcc7152dc1cb55dbaea26a8a78e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blessings \
python310-blessings \
python3dist-blessings"

RDEPENDS:${PN} += "python-abi \
python310-curses \
python310-six"

inherit rpm
