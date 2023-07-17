SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "terminfo-base-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "6e5e8f427e4a410f789f204713d431a8d36ddef7d8a4cd70e4a5ce396be9b7ddc65175b3c91ef7afa251234bd1a7df19312a753d147c61322a0d9d1e87d69b06"

RPROVIDES:${PN} += "config-terminfo-base \
ncurses-/usr/share/tabset \
terminfo-base"

RDEPENDS:${PN} += "ncurses"

inherit rpm
