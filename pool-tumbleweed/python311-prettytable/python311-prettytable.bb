SUMMARY = "Library for displaying tabular data in formatted fashion"
DESCRIPTION = "PrettyTable is a Python library for representing tabular data in \
ASCII tables, inspired by the tables emitted by the PostgreSQL shell, \
psql. PrettyTable allows for selection of which columns are to be \
printed, independent alignment of columns (left or right justified or \
centred) and printing of 'sub-tables' by specifying a row range."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python311-prettytable-3.7.0-1.3.noarch.rpm"
RPM_HASH = "2c4839343ec4e2cf3a05aad2f5f1a32aaa41e58e38754f9f2735c3c82ff5fd12638263286ff37c78344d8e3aaf3090b5c6c7555b3abfc5755246502c683611ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PrettyTable \
python3-prettytable \
python3.11dist-prettytable \
python311-PrettyTable \
python311-prettytable \
python3dist-prettytable"

RDEPENDS:${PN} += "python-abi \
python311-wcwidth"

inherit rpm
