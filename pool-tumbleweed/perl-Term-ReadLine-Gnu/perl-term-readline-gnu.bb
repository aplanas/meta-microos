SUMMARY = "Perl extension for the GNU Readline/History Library"
DESCRIPTION = "This is an implementation of Term::ReadLine using the GNU Readline/History \
Library. \
 \
For basic functions object oriented interface is provided. These are \
described in the section 'Standard Methods' and 'Term::ReadLine::Gnu \
Functions'. \
 \
This package also has the interface with the almost all functions and \
variables which are documented in the GNU Readline/History Library Manual."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.45"

RPM_NAME = "perl-Term-ReadLine-Gnu-1.45-1.3.aarch64.rpm"
RPM_HASH = "e1f354f3617a6b20cf99e3968cd71461d193b6f68b21383ce47f951eb77b875e092dfc6d7705cc1e0bdca01ae2f192443a1a6f864e9b37a993fe20bae4b4606f"

RPROVIDES:${PN} += "perl-Term--ReadLine--Gnu \
perl-Term--ReadLine--Gnu--AU \
perl-Term--ReadLine--Gnu--Var \
perl-Term--ReadLine--Gnu--XS \
perl-Term-ReadLine-Gnu \
perl-TermReadLine-Gnu"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
