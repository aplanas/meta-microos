SUMMARY = "Parse 02packages.details.txt.gz"
DESCRIPTION = "The Comprehensive Perl Archive Network (CPAN) is a very useful collection \
of Perl code. It has several indices of the files that it hosts, including \
a file named '02packages.details.txt.gz' in the 'modules' directory. This \
file contains lots of useful information and this module provides a simple \
interface to the data contained within. \
 \
In a future release the Parse::CPAN::Packages::Package manpage and the \
Parse::CPAN::Packages::Distribution manpage might have more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.40"

RPM_NAME = "perl-Parse-CPAN-Packages-2.40-1.26.noarch.rpm"
RPM_HASH = "a602fd227547bcf2c2bd7a94b49cf56791c1b7279d0cc1bbebdef54c0b1c6a148c899d1836922ce102dacccba80271a528c1324b455854b993af7f4e786aec9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--CPAN--Packages \
perl-Parse--CPAN--Packages--Distribution \
perl-Parse--CPAN--Packages--Package \
perl-Parse-CPAN-Packages"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Peek \
perl-CPAN--DistnameInfo \
perl-Compress--Zlib \
perl-File--Slurp \
perl-Moo \
perl-PPI \
perl-Path--Class \
perl-Test--InDistDir \
perl-Type--Utils \
perl-Types--Standard \
perl-version"

inherit rpm
