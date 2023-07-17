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

PV = "1.46"

RPM_NAME = "perl-Term-ReadLine-Gnu-1.46-1.1.aarch64.rpm"
RPM_HASH = "11186c35b95f73f7e9a139807ba4358136505090aaedfd6f770eb4a3932f40a4988953668b9080efbfdbef273acc4dd7c730801164f105c72e375e33b7ca1871"

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
