SUMMARY = "Collection of Perl modules for working with XML"
DESCRIPTION = "perl-libxml-perl is a collection of Perl modules for working with XML. \
 \
 \
 \
Authors: \
-------- \
    Ken MacLeod <ken@bitsko.slc.ut.us>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.08"

RPM_NAME = "perl-libxml-perl-0.08-159.29.aarch64.rpm"
RPM_HASH = "5e3b3d34257533250b54edfff9ed5d2603ec2a45a76ede4ad101952b893f9eb46535d04100f571d83dc392bb9a36a00d17b5710cb98bec39fe9db04389080661"

RPROVIDES:${PN} += "perl(Data::Grove) \
perl(Data::Grove::Characters) \
perl(Data::Grove::Parent) \
perl(Data::Grove::ParentList) \
perl(Data::Grove::Visitor) \
perl(XML::ESISParser) \
perl(XML::Handler::CanonXMLWriter) \
perl(XML::Handler::Sample) \
perl(XML::Handler::Subs) \
perl(XML::Handler::XMLWriter) \
perl(XML::Parser::PerlSAX) \
perl(XML::PatAct::ACTION) \
perl(XML::PatAct::Amsterdam) \
perl(XML::PatAct::MatchName) \
perl(XML::PatAct::PATTERN) \
perl(XML::PatAct::ToObjects) \
perl(XML::Perl2SAX) \
perl(XML::SAX2Perl) \
perl-libxml-perl \
perl-libxml-perl(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-XML-Parser"

inherit rpm
