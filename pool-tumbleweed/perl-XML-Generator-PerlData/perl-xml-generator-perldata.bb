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

RPM_NAME = "perl-XML-Generator-PerlData-0.95-1.25.noarch.rpm"
RPM_HASH = "95d1bee08b71ee8de0f4d5eac9d31a10467f0602b5f2fc1bf51045c8cf8e072ecee4a6f1186dcdc3db325f14f88fb6a52511a2b0fe9394dbd0b083dbef9d6be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::Generator::PerlData) \
perl-XML-Generator-PerlData"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(XML::SAX::Base)"

inherit rpm
