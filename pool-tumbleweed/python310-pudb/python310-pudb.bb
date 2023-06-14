SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python310-pudb-2022.1.3-1.4.noarch.rpm"
RPM_HASH = "2770e621b106ed4e4b4de7fb3753a90406786e38297bd81418da43852814c3005528956d6cf4e3c4b5d6e381d6f54dc1c80077dd8d09e3e413e7714ae4b82ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pudb \
python3.10dist-pudb \
python310-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Pygments \
python310-urwid \
update-alternatives"

inherit rpm
