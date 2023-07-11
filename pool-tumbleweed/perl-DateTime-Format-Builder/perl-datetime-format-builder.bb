SUMMARY = "Create DateTime parser classes and objects"
DESCRIPTION = "DateTime::Format::Builder creates DateTime parsers. Many string formats of \
dates and times are simple and just require a basic regular expression to \
extract the relevant information. Builder provides a simple way to do this \
without writing reams of structural code. \
 \
Builder provides a number of methods, most of which you'll never need, or \
at least rarely need. They're provided more for exposing of the module's \
innards to any subclasses, or for when you need to do something slightly \
beyond what I expected."
LICENSE = "Artistic-2.0"

PV = "0.83"

RPM_NAME = "perl-DateTime-Format-Builder-0.83-1.14.noarch.rpm"
RPM_HASH = "6575843ba2087345fdf7ec3564ae7b53847afafb6b986e54336d8385d19f1f2fabec6a4795db941fcce2d94eeaf972f37b7380d4e98b441f6c9cfc287f1e6ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Builder \
perl-DateTime--Format--Builder--Parser \
perl-DateTime--Format--Builder--Parser--Dispatch \
perl-DateTime--Format--Builder--Parser--Quick \
perl-DateTime--Format--Builder--Parser--Regex \
perl-DateTime--Format--Builder--Parser--Strptime \
perl-DateTime--Format--Builder--Parser--generic \
perl-DateTime-Format-Builder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-DateTime--Format--Strptime \
perl-Params--Validate \
perl-parent"

inherit rpm
