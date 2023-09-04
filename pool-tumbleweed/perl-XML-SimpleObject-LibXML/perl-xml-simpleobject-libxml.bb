SUMMARY = "Perl extension allowing a simple(r) object representation of an XML::Lib[cut]"
DESCRIPTION = "This is a short and simple class allowing simple object access to a parsed \
XML::LibXML tree, with methods for fetching children and attributes in as \
clean a manner as possible. My apologies for further polluting the XML:: \
space; this is a small and quick module, with easy and compact usage. Some \
will rightfully question placing another interface over the DOM methods \
provided by XML::LibXML, but my experience is that people appreciate the \
total simplicity provided by this module, despite its limitations. These \
limitations include a minor loss of speed compared to the DOM, loss of \
control over node types, and protection (aka lack of knowledge) about the \
DOM. I encourage those who want more control and understanding over the DOM \
to study XML::LibXML; this module's source can be instructive, too."
LICENSE = "Artistic-1.0"

PV = "0.60"

RPM_NAME = "perl-XML-SimpleObject-LibXML-0.60-126.28.noarch.rpm"
RPM_HASH = "6fdf28f600e5f0316326f0ed19c4243a82da8c9e80b62c0d4178f932ac56297f29275e605f0e92c82d96a146c8855c2624f15f3c2317f4c70a0649052a6d8cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SimpleObject--LibXML \
perl-XML-SimpleObject-LibXML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--LibXML"

inherit rpm
