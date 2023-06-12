SUMMARY = "Add/Extend Ssl Support for Common Perl Modules"
DESCRIPTION = "Some commonly used perl modules don't have SSL support at all, even if the \
protocol supports it. Others have SSL support, but most of them don't do \
proper checking of the server's certificate. \
 \
The 'Net::SSLGlue::*' modules try to add SSL support or proper certificate \
checking to these modules. Currently support for the following modules is \
available: \
 \
* Net::SMTP - add SSL from beginning or using STARTTLS \
 \
* Net::POP3 - add SSL from beginning or using STLS \
 \
* Net::FTP  - add SSL and IPv6 support to Net::FTP \
 \
* Net::LDAP - add proper certificate checking \
 \
* LWP - add proper certificate checking for older LWP versions \
 \
There is also a Net::SSLGlue::Socket package which combines ssl and non-ssl \
and ipv6 capabilities to make it easier to enhance modules based on \
IO::Socket::INET."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.058"

RPM_NAME = "perl-Net-SSLGlue-1.058-1.23.noarch.rpm"
RPM_HASH = "a160f83116c1d7e6060e1f64084c28964945afe29d5b8017bd400cd00b9a631d27f3edfce8928fd371363da571b0f7fa4edbf129a339eca00ae2452b9cff1356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::SSLGlue) \
perl(Net::SSLGlue::FTP) \
perl(Net::SSLGlue::FTP::SingleSessionCache) \
perl(Net::SSLGlue::LDAP) \
perl(Net::SSLGlue::LWP) \
perl(Net::SSLGlue::LWP::Socket) \
perl(Net::SSLGlue::POP3) \
perl(Net::SSLGlue::POP3::_SSL_Socket) \
perl(Net::SSLGlue::POP3::_SSLified) \
perl(Net::SSLGlue::SMTP) \
perl(Net::SSLGlue::SMTP::_SSL_Socket) \
perl(Net::SSLGlue::SMTP::_SSLified) \
perl(Net::SSLGlue::Socket) \
perl(Net::SSLGlue::Socket::HANDLE) \
perl-Net-SSLGlue"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::Socket::SSL)"

inherit rpm
