SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python310-proselint-0.13.0-3.1.noarch.rpm"
RPM_HASH = "75738d1a3a24ea43dd078544c25d08772430103b85370593e132dd42024917623dd1422bb9decb2de0d776980eb4edf6cf2304ec5a4d54e1a976d548ee85480d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proselint \
python310-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-dbm \
update-alternatives"

inherit rpm
