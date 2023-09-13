SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python39-pudb-2022.1.3-2.1.noarch.rpm"
RPM_HASH = "da767c3791c9884583a90a3267f7471c365011731bbaaea4b193919970962e8af66cbc4dcccf48e0b55bb47cb3e1fcf9b5b68d38ed45ba477b4c2d5e685ac1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pudb \
python39-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pygments \
python39-jedi \
python39-packaging \
python39-urwid \
python39-urwid-readline \
update-alternatives"

inherit rpm
