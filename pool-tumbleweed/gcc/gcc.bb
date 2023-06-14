SUMMARY = "The system GNU C Compiler"
DESCRIPTION = "The system GNU C Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-13-1.3.aarch64.rpm"
RPM_HASH = "3b577600552051167f15000928b5ffa240e09197569ec10288797f080ba5cdb699f3aaf5ab1c83d066e074c8330edcd8ab4fd5374ab37936bac20d0eceeaaa36"

RPROVIDES:${PN} += "c-compiler \
gcc"

RDEPENDS:${PN} += "cpp \
gcc13"

inherit rpm
