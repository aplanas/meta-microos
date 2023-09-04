SUMMARY = "Tcp_connect with Transparent Proxy Handling"
DESCRIPTION = "AnyEvent::Connector object has 'tcp_connect' method compatible with that \
from AnyEvent::Socket, and it handles proxy settings transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-AnyEvent-Connector-0.03-1.14.noarch.rpm"
RPM_HASH = "14bf2225ff2be1c6e4b5fac0129782f645285a34ec8449566f72d7f3df322c6d776c32ab37b86a9f4029ac3b10060222cfb884c60ae1d0327847cca6fde00d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--Connector \
perl-AnyEvent--Connector--Proxy--http \
perl-AnyEvent-Connector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AnyEvent--Handle \
perl-AnyEvent--Socket \
perl-URI \
perl-base"

inherit rpm
