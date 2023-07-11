SUMMARY = "Python 3 interface to DNF"
DESCRIPTION = "This package provides the Python 3 interface to DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "python3-dnf-4.14.0-3.2.noarch.rpm"
RPM_HASH = "fa4b37732cf7b3d7f6866ca2feaf8d7c1b2ec3821667f76e22289a86ffcb15510bf5ab37b550e76ce0d9c8da183f96c8eb79be98d3102caa71cf13dfe22d7dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnf"

RDEPENDS:${PN} += "/usr/bin/python3 \
deltarpm \
dnf-data \
python-abi \
python3-curses \
python3-gpg \
python3-hawkey \
python3-libcomps \
python3-libmodulemd \
python3-rpm"

inherit rpm
