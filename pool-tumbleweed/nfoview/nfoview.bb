SUMMARY = "Simple Viewer for NFO Files"
DESCRIPTION = "NFO Viewer is a simple viewer for NFO files, which are 'ASCII' art in \
the CP437 codepage. The advantages of using NFO Viewer instead of a text \
editor are preset font and encoding settings, automatic window size and \
clickable hyperlinks."
LICENSE = "GPL-3.0-or-later"

PV = "1.29"

RPM_NAME = "nfoview-1.29-1.3.noarch.rpm"
RPM_HASH = "598a996ba287f47d055861c30791425c1e4f5346525e5c7d20371fbbc20f08b8abd646bbd3e925b4ac89b016b5e6b176181a3518456273b37958a05e9ecdabff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nfoview \
python3.11dist-nfoview \
python3dist-nfoview"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
