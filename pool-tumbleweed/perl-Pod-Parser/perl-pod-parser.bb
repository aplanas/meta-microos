SUMMARY = "Modules for parsing/translating POD format documents"
DESCRIPTION = "*NOTE: This module is considered legacy; modern Perl releases (5.31.1 and \
higher) are going to remove Pod-Parser from core and use Pod::Simple for \
all things POD.* \
 \
*Pod::Parser* is a base class for creating POD filters and translators. It \
handles most of the effort involved with parsing the POD sections from an \
input stream, leaving subclasses free to be concerned only with performing \
the actual translation of text. \
 \
*Pod::Parser* parses PODs, and makes method calls to handle the various \
components of the POD. Subclasses of *Pod::Parser* override these methods \
to translate the POD into whatever output format they desire."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.66"

RPM_NAME = "perl-Pod-Parser-1.66-1.2.noarch.rpm"
RPM_HASH = "2f195853b07456e18281e6e9119fc77ca8404422199a7f862e128b336bee28a058ecbec4d2be6218208759cffdcfd86db12ecda89622c738dcb379c837b9bfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Cache \
perl-Pod--Cache--Item \
perl-Pod--Find \
perl-Pod--Hyperlink \
perl-Pod--InputObjects \
perl-Pod--InputSource \
perl-Pod--InteriorSequence \
perl-Pod--List \
perl-Pod--Paragraph \
perl-Pod--ParseTree \
perl-Pod--ParseUtils \
perl-Pod--Parser \
perl-Pod--PlainText \
perl-Pod--Select \
perl-Pod-Parser"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
