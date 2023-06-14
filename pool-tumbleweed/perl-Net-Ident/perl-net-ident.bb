SUMMARY = "Lookup the username on the remote end of a TCP/IP connection"
DESCRIPTION = "You can either use the simple interface, which does one ident lookup at a \
time, or use the asynchronous interface to perform (possibly) many \
simultaneous lookups, or simply continue serving other things while the \
lookup is proceeding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.25"

RPM_NAME = "perl-Net-Ident-1.25-1.13.noarch.rpm"
RPM_HASH = "affddcee0d2ad6d74e662b4204ad46787230fe91af5ced4d66ff215faf3f2f09354d931bfa429ec6265757f1b33f10473c58258f9d4e4b346930a8ee0e248544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Ident \
perl-Net-Ident"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
