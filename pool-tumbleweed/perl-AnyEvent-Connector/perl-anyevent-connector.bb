SUMMARY = "Tcp_connect with Transparent Proxy Handling"
DESCRIPTION = "AnyEvent::Connector object has 'tcp_connect' method compatible with that \
from AnyEvent::Socket, and it handles proxy settings transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-AnyEvent-Connector-0.03-1.12.noarch.rpm"
RPM_HASH = "3a7d0f5169c6fa9084b6dbda7dfcc63328d903935bd04a5667cd217330e1eeeff8e1779b9a41707f1b334757883cec7385f155ad71333c27bf0f2c9b84aad171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AnyEvent::Connector) \
perl(AnyEvent::Connector::Proxy::http) \
perl-AnyEvent-Connector"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(AnyEvent::Handle) \
perl(AnyEvent::Socket) \
perl(URI) \
perl-base"

inherit rpm
