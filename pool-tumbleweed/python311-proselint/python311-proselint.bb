SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python311-proselint-0.13.0-3.1.noarch.rpm"
RPM_HASH = "b296746db8fbaaa7f6544b0db98846f3b8c2473f0d371d4fe8459d9a0abece20560daec7e9b37f3ce0c124d0d5ccaa10807742f6ef50a65e6c8a8dc696935fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proselint \
python3.11dist-proselint \
python311-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-dbm \
update-alternatives"

inherit rpm
