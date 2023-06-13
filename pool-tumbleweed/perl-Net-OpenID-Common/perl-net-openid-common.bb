SUMMARY = "Libraries shared between Net::OpenID::Consumer and Net::OpenID::Server"
DESCRIPTION = "The Consumer and Server implementations share a few libraries which live \
with this module. This module is here largely to hold the version number \
and this documentation, though it also incorporates some utility functions \
inherited from previous versions of Net::OpenID::Consumer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20"

RPM_NAME = "perl-Net-OpenID-Common-1.20-1.25.noarch.rpm"
RPM_HASH = "14507d70ae9ded0e513963306a7d6974945f11fc98a654a729fdfe20ab64b2731b44e74a8e3c72d65d34b08de3511e79d19d586f5cdad04645424a0add0cc4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::OpenID::Common) \
perl(Net::OpenID::Extension) \
perl(Net::OpenID::Extension::SimpleRegistration) \
perl(Net::OpenID::Extension::SimpleRegistration::Request) \
perl(Net::OpenID::Extension::SimpleRegistration::Response) \
perl(Net::OpenID::ExtensionMessage) \
perl(Net::OpenID::IndirectMessage) \
perl(Net::OpenID::URIFetch) \
perl(Net::OpenID::URIFetch::Response) \
perl(Net::OpenID::Yadis) \
perl(Net::OpenID::Yadis::Service) \
perl(OpenID::util) \
perl-Net-OpenID-Common"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Crypt::DH::GMP) \
perl(HTML::Parser) \
perl(HTTP::Headers::Util) \
perl(HTTP::Message) \
perl(HTTP::Request) \
perl(HTTP::Status) \
perl(XML::Simple)"

inherit rpm
