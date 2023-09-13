SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python311-pudb-2022.1.3-2.1.noarch.rpm"
RPM_HASH = "395ca07f51b40f1331f4c85ac2e7bb4c63e46cc1601dfdd96f4e82dd1a050d7ab5a96b2fcfa61c5f8a7967149151fec88b6028c5cdbd3cb6c85efe46c07c5b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pudb \
python3.11dist-pudb \
python311-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pygments \
python311-jedi \
python311-packaging \
python311-urwid \
python311-urwid-readline \
update-alternatives"

inherit rpm
