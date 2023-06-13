SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "terminfo-base-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "4084407a38e9c53e5ed230d06f34ea786d15b3b6ee905c514a7d89bdddf81d418f349885a78d068b220d826a842cbd306a0fd16fee3d3a7223dfb9550d40eeb7"

RPROVIDES:${PN} += "config(terminfo-base) \
ncurses:/usr/share/tabset \
terminfo-base \
terminfo-base(aarch-64)"

RDEPENDS:${PN} += "ncurses"

inherit rpm
