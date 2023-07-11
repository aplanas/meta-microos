SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python311-pudb-2022.1.3-1.6.noarch.rpm"
RPM_HASH = "34be879c6affc877becf31f63241766428fe0bef1c66f4e14277da411b1402289c0c05e3f6b3518a2ba6b8d0be396d4db5f0157c7f81ecf46af067b6b5b2547d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pudb \
python3.11dist-pudb \
python311-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pygments \
python311-urwid \
update-alternatives"

inherit rpm
