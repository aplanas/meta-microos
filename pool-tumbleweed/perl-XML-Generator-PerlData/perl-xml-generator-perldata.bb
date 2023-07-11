SUMMARY = "Perl extension for generating SAX2 events from nested Perl data structures"
DESCRIPTION = "XML::Generator::PerlData provides a simple way to generate SAX2 events from \
nested Perl data structures, while providing finer-grained control over the \
resulting document streams. \
 \
Processing comes in two flavors: *Simple Style* and *Stream Style*: \
 \
In a nutshell, 'simple style' is best used for those cases where you have a \
a single Perl data structure that you want to convert to XML as quickly and \
painlessly as possible. 'Stream style' is more useful for cases where you \
are receiving chunks of data (like from a DBI handle) and you want to \
process those chunks as they appear. See *PROCESSING METHODS* for more info \
about how each style works."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.95"

RPM_NAME = "perl-XML-Generator-PerlData-0.95-1.26.noarch.rpm"
RPM_HASH = "cf1502416d226d82bf198cfe1f31bb5c6d509377de9aa6477140cad0c61b0d95658f6b6539d486c557b36c3c1788b1f9eaf92cd65e56bdadfd991abd9952f9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Generator--PerlData \
perl-XML-Generator-PerlData"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--SAX--Base"

inherit rpm
