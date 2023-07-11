SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python310-proselint-0.13.0-2.6.noarch.rpm"
RPM_HASH = "b428f61505aff8611bafc16a1994cc4598d84e8c3383acc926195d38f7144526f878b7a363b958e54d5727a2bbddefdb1d02a0b69c64140dde2e21c76ab7d582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proselint \
python310-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-dbm \
python310-future \
update-alternatives"

inherit rpm
