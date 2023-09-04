SUMMARY = "Lookup the username on the remote end of a TCP/IP connection"
DESCRIPTION = "You can either use the simple interface, which does one ident lookup at a \
time, or use the asynchronous interface to perform (possibly) many \
simultaneous lookups, or simply continue serving other things while the \
lookup is proceeding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.25"

RPM_NAME = "perl-Net-Ident-1.25-1.15.noarch.rpm"
RPM_HASH = "33ccd39c0bf53cae129169ab7bf26b4ef4d259f24b8d8f2119b73819a4b2c39f33adc03c249cb97540f6926b6f0eb0087620cad67eab29de2ee540bb22c7994e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Ident \
perl-Net-Ident"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
