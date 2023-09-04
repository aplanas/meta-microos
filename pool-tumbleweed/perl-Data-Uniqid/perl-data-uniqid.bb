SUMMARY = "Perl extension for simple genrating of unique id's"
DESCRIPTION = "Data::Uniqid provides three simple routines for generating unique ids. \
These ids are coded with a Base62 systen to make them short and handy (e.g. \
to use it as part of a URL). \
 \
  suinqid \
    genrates a very short id valid only for the localhost and with a \
    liftime of 1 day \
 \
  uniqid \
    generates a short id valid on the local host \
 \
  luniqid \
    generates a long id valid everywhere and ever"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.12"

RPM_NAME = "perl-Data-Uniqid-0.12-1.25.noarch.rpm"
RPM_HASH = "97eac382e5740b128a9ec46c6c8708f710255feeb74a241a5d5aadae1758a31ac2d7ac253cf7b72cf54572a0b0d1af92dd27255840f11f788bea1620d9101d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Uniqid \
perl-Data-Uniqid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
