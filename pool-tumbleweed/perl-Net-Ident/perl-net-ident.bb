SUMMARY = "Lookup the username on the remote end of a TCP/IP connection"
DESCRIPTION = "You can either use the simple interface, which does one ident lookup at a \
time, or use the asynchronous interface to perform (possibly) many \
simultaneous lookups, or simply continue serving other things while the \
lookup is proceeding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.25"

RPM_NAME = "perl-Net-Ident-1.25-1.14.noarch.rpm"
RPM_HASH = "fb773d54f84dbef8593b9e2cad91e9b3fc41ba59c861dae73ddfe7fc5dd935eeb8461577047d0b7ea6b82b8dc066f581e09643e59a74e1ed98547f14a4584297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Ident \
perl-Net-Ident"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
