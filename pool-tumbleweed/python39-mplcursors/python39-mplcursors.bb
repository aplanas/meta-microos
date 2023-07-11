SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python39-mplcursors-0.5.2-1.5.noarch.rpm"
RPM_HASH = "09ba88e7a62b7bb1f4f2143cc9ddca7fe6fe18040027a52a2bff02ad8e5101e1880b84c34103a7f0e7b28f9a7fdf38ea617fde1bd616707b6cd7c83284171a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mplcursors \
python39-mplcursors \
python3dist-mplcursors"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib"

inherit rpm
