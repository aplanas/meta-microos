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

RPM_NAME = "perl-XML-SimpleObject-LibXML-0.60-126.27.noarch.rpm"
RPM_HASH = "4eb9e4359dce0ab187de87679173db05486c8c6670bc23df18bcb1093d81dc47ed79973f75b4dfbe64a9db2ab07586541af743d33ad023be4932ddf35b545400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SimpleObject--LibXML \
perl-XML-SimpleObject-LibXML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--LibXML"

inherit rpm
