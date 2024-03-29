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

RPM_NAME = "perl-Term-ReadLine-Gnu-1.46-1.2.aarch64.rpm"
RPM_HASH = "4f7ccfec14a8aa54c9e1f45a0e88b7de850d2cdbcc4c1adb29d9c83e4fe47f927a3b113161cc0f271f217cf3acd370062820f051a7f59a482c97000704da4cc5"

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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
