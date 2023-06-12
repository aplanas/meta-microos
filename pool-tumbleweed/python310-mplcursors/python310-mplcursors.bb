SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python310-mplcursors-0.5.2-1.3.noarch.rpm"
RPM_HASH = "6b3fe909931dccbfda4c54c7a2c5d21348d5654c33c9d9f1354989b24884ffd49db29eb4d832f8ad4e4a89e5cedf9c454db8776db33676a28805c9ca5c47de2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mplcursors \
python3.10dist(mplcursors) \
python310-mplcursors \
python3dist(mplcursors)"
RDEPENDS:${PN} += "python(abi) \
python310-matplotlib"

inherit rpm
