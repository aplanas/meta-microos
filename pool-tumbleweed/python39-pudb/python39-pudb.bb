SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python39-pudb-2022.1.3-1.4.noarch.rpm"
RPM_HASH = "e8163d56a311271863eb6336cf52f0ecddf0c44eaa323291c8455e849912565be17e73aa6ba26d2a29bb13034542901f2560355bcd10a9cc01b76216a4ab58f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pudb \
python39-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Pygments \
python39-urwid \
update-alternatives"

inherit rpm
