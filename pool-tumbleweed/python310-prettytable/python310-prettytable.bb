SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python310-prettytable-3.7.0-1.3.noarch.rpm"
RPM_HASH = "fee07a708756f626c94a39bad73f910931c9a16f26845794fe25d70294a83e5e030f1031ac34c8459cbb5e0d530fe431da4ee10555007be86eded2e3c591fd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-prettytable \
python310-PrettyTable \
python310-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python310-wcwidth"

inherit rpm
