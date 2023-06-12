SUMMARY = "Perl's Web Services Toolkit"
DESCRIPTION = "SOAP::Lite is a collection of Perl modules which provides a simple and \
lightweight interface to the Simple Object Access Protocol (SOAP) both on \
client and server side."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & CC-BY-ND-2.0"

PV = "1.27"

RPM_NAME = "perl-SOAP-Lite-1.27-3.10.noarch.rpm"
RPM_HASH = "e954e060c43fe83ae73a6c6bf208cbcdcb2e27eb3975e210488a3c44bf66dd04dea3731d40f99203c4adc754579387272e963698fb66628bebf2e0711133e5cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Apache::SOAP) \
perl(SOAP) \
perl(SOAP::Client) \
perl(SOAP::Cloneable) \
perl(SOAP::Constants) \
perl(SOAP::Custom::XML::Data) \
perl(SOAP::Custom::XML::Deserializer) \
perl(SOAP::Data) \
perl(SOAP::Deserializer) \
perl(SOAP::Fault) \
perl(SOAP::Header) \
perl(SOAP::Lite) \
perl(SOAP::Lite::COM) \
perl(SOAP::Lite::Deserializer::XMLSchema1999) \
perl(SOAP::Lite::Deserializer::XMLSchema2001) \
perl(SOAP::Lite::Deserializer::XMLSchemaSOAP1_1) \
perl(SOAP::Lite::Deserializer::XMLSchemaSOAP1_2) \
perl(SOAP::Lite::Packager) \
perl(SOAP::Lite::Packager::DIME) \
perl(SOAP::Lite::Packager::MIME) \
perl(SOAP::Lite::Utils) \
perl(SOAP::Packager) \
perl(SOAP::Packager::DIME) \
perl(SOAP::Packager::MIME) \
perl(SOAP::Parser) \
perl(SOAP::SOM) \
perl(SOAP::Schema) \
perl(SOAP::Schema::Deserializer) \
perl(SOAP::Schema::WSDL) \
perl(SOAP::Serializer) \
perl(SOAP::Server) \
perl(SOAP::Server::Object) \
perl(SOAP::Server::Parameters) \
perl(SOAP::Test) \
perl(SOAP::Test::Server) \
perl(SOAP::Trace) \
perl(SOAP::Transport) \
perl(SOAP::Transport::HTTP) \
perl(SOAP::Transport::HTTP::Apache) \
perl(SOAP::Transport::HTTP::CGI) \
perl(SOAP::Transport::HTTP::Client) \
perl(SOAP::Transport::HTTP::Daemon) \
perl(SOAP::Transport::HTTP::FCGI) \
perl(SOAP::Transport::HTTP::Server) \
perl(SOAP::Transport::IO) \
perl(SOAP::Transport::IO::Server) \
perl(SOAP::Transport::LOCAL) \
perl(SOAP::Transport::LOCAL::Client) \
perl(SOAP::Transport::LOOPBACK) \
perl(SOAP::Transport::LOOPBACK::Client) \
perl(SOAP::Transport::MAILTO) \
perl(SOAP::Transport::MAILTO::Client) \
perl(SOAP::Transport::POP3) \
perl(SOAP::Transport::POP3::Server) \
perl(SOAP::Transport::TCP) \
perl(SOAP::Transport::TCP::Client) \
perl(SOAP::Transport::TCP::Server) \
perl(SOAP::Utils) \
perl(SOAP::XMLSchema1999::Serializer) \
perl(SOAP::XMLSchema2001::Serializer) \
perl(SOAP::XMLSchema::Serializer) \
perl(SOAP::XMLSchemaApacheSOAP::Deserializer) \
perl-SOAP-Lite"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Inspector) \
perl(Compress::Zlib) \
perl(IO::SessionData) \
perl(IO::Socket::SSL) \
perl(LWP::Protocol::https) \
perl(LWP::UserAgent) \
perl(MIME::Base64) \
perl(Scalar::Util) \
perl(Task::Weaken) \
perl(URI) \
perl(URI::Escape) \
perl(XML::Parser) \
perl(XML::Parser::Lite) \
perl(constant)"

inherit rpm
