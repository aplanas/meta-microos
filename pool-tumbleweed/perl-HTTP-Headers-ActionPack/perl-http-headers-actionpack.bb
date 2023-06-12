SUMMARY = "HTTP Action, Adventure and Excitement"
DESCRIPTION = "This is a module to handle the inflation and deflation of complex HTTP \
header types. In many cases header values are simple strings, but in some \
cases they are complex values with a lot of information encoded in them. \
The goal of this module is to make the parsing and analysis of these \
headers as easy as calling 'inflate' on a compatible object (see below for \
a list). \
 \
This top-level class is basically a Factory for creating instances of the \
other classes in this module. It contains a number of convenience methods \
to help make common cases easy to write."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-HTTP-Headers-ActionPack-0.09-1.24.noarch.rpm"
RPM_HASH = "3f5f3039f5da2054ec4eed12273201959650b963a7f247ca9d43792371c0c8054aa95d31b52229964e3b8e0181a7033b9400b940d03f8314076b56d2c2a3831f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Headers::ActionPack) \
perl(HTTP::Headers::ActionPack::AcceptCharset) \
perl(HTTP::Headers::ActionPack::AcceptLanguage) \
perl(HTTP::Headers::ActionPack::AuthenticationInfo) \
perl(HTTP::Headers::ActionPack::Authorization) \
perl(HTTP::Headers::ActionPack::Authorization::Basic) \
perl(HTTP::Headers::ActionPack::Authorization::Digest) \
perl(HTTP::Headers::ActionPack::ContentNegotiation) \
perl(HTTP::Headers::ActionPack::Core::Base) \
perl(HTTP::Headers::ActionPack::Core::BaseAuthHeader) \
perl(HTTP::Headers::ActionPack::Core::BaseHeaderList) \
perl(HTTP::Headers::ActionPack::Core::BaseHeaderType) \
perl(HTTP::Headers::ActionPack::Core::BaseHeaderWithParams) \
perl(HTTP::Headers::ActionPack::DateHeader) \
perl(HTTP::Headers::ActionPack::LinkHeader) \
perl(HTTP::Headers::ActionPack::LinkList) \
perl(HTTP::Headers::ActionPack::MediaType) \
perl(HTTP::Headers::ActionPack::MediaTypeList) \
perl(HTTP::Headers::ActionPack::PriorityList) \
perl(HTTP::Headers::ActionPack::Util) \
perl(HTTP::Headers::ActionPack::WWWAuthenticate) \
perl-HTTP-Headers-ActionPack"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTTP::Date) \
perl(HTTP::Headers::Util) \
perl(Module::Runtime) \
perl(Sub::Exporter) \
perl(Time::Piece) \
perl(URI::Escape) \
perl(parent)"

inherit rpm
