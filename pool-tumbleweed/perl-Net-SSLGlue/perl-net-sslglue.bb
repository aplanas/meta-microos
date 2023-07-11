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

RPM_NAME = "perl-Net-SSLGlue-1.058-1.24.noarch.rpm"
RPM_HASH = "b54e67cf57d37a38293af09607b55672eccae4b4aa8a4ee76df9474b12bf8f9be41452f6159d53041a0803aa7938a8c938d7ef243f14fad8cc3e3035d45226e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--SSLGlue \
perl-Net--SSLGlue--FTP \
perl-Net--SSLGlue--FTP--SingleSessionCache \
perl-Net--SSLGlue--LDAP \
perl-Net--SSLGlue--LWP \
perl-Net--SSLGlue--LWP--Socket \
perl-Net--SSLGlue--POP3 \
perl-Net--SSLGlue--POP3---SSL-Socket \
perl-Net--SSLGlue--POP3---SSLified \
perl-Net--SSLGlue--SMTP \
perl-Net--SSLGlue--SMTP---SSL-Socket \
perl-Net--SSLGlue--SMTP---SSLified \
perl-Net--SSLGlue--Socket \
perl-Net--SSLGlue--Socket--HANDLE \
perl-Net-SSLGlue"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Socket--SSL"

inherit rpm
