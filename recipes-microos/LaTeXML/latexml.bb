SUMMARY = "TeX and LaTeX to XML translator"
DESCRIPTION = "LaTeXML is a TeX & LaTeX to XML, HTML, MathML, ePub, JATS, ... converter."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.7"

RPM_NAME = "LaTeXML-0.8.7-1.2.noarch.rpm"
RPM_HASH = "9bf4b78dfaee98a0320cd87e2d396be8b09ed1d7a5a54320b597bd1d0695bc40047ac2b70e71a9eaa24993728abc27d43965aa8ade902d46e0a4c3cd7f8e294e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LaTeXML"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Zip) \
perl(DB_File) \
perl(File::Which) \
perl(Getopt::Long) \
perl(IO::String) \
perl(Image::Size) \
perl(JSON::XS) \
perl(LWP::Protocol::https) \
perl(LaTeXML) \
perl(Parse::RecDescent) \
perl(Pod::Find) \
perl(Test::Simple) \
perl(Text::Unidecode) \
perl(Time::HiRes) \
perl(URI) \
perl(UUID::Tiny) \
perl(XML::LibXML) \
perl(XML::LibXSLT)"

inherit rpm
