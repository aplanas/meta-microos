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

RPM_NAME = "perl-Pod-Parser-1.66-1.3.noarch.rpm"
RPM_HASH = "c8d52eefb490b372bbfb3904c4f5e64d3141eadccff28f5790339fbb5eb3b8a6cb519d49f3af80ef46e29e37e6cb621e4737c87348981e519303cc63acca34d9"
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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
