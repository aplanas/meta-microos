SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.8.0"

RPM_NAME = "python310-prettytable-3.8.0-1.1.noarch.rpm"
RPM_HASH = "a552bd89bc721ebdc6928ab62610c432d2a81a57aba2602aa6cc803c522a6a1df307c6358ae823e5d44f8ac83939e23edc25fadbb5950257e4da3a0ceae8e942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-prettytable \
python310-PrettyTable \
python310-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python310-wcwidth"

inherit rpm
