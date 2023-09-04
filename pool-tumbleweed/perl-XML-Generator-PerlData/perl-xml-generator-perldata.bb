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

RPM_NAME = "perl-XML-Generator-PerlData-0.95-1.27.noarch.rpm"
RPM_HASH = "db1de22190a7cba96425f36b71d40dab6bb8cf2cfd6d79d787c4fd8ff3f042fbd380c2d6cf2339da94a4ed46d9bbbd9dee3e607fd750986d7006c551ae8a2c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Generator--PerlData \
perl-XML-Generator-PerlData"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--SAX--Base"

inherit rpm
