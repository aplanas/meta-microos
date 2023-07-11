SUMMARY = "Tcp_connect with Transparent Proxy Handling"
DESCRIPTION = "AnyEvent::Connector object has 'tcp_connect' method compatible with that \
from AnyEvent::Socket, and it handles proxy settings transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-AnyEvent-Connector-0.03-1.13.noarch.rpm"
RPM_HASH = "5a97539756bc6aa2c1e7c7e2a3fdf9603294457c192503b64b6c9d1e5504c93df07233f66bbb6c01c6556a74a4f721d5bee06bdd658620eecd49ea6e1203f01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--Connector \
perl-AnyEvent--Connector--Proxy--http \
perl-AnyEvent-Connector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AnyEvent--Handle \
perl-AnyEvent--Socket \
perl-URI \
perl-base"

inherit rpm
