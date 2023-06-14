SUMMARY = "WebSocket server for AnyEvent"
DESCRIPTION = "This class is an implementation of the WebSocket server in an AnyEvent \
context. \
 \
  * Currently this module supports WebSocket protocol version 13 only. See at \
https://tools.ietf.org/html/rfc6455 for detail."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-AnyEvent-WebSocket-Server-0.10-1.10.noarch.rpm"
RPM_HASH = "d335b6f63b11f3221693b001b833dae6f8c5f9e99762d19fd9097152ec47a5bd8b1d8b33c3c8d843e57dacb8d9439e59fede594e8b462b261c1d84aba7954d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--WebSocket--Server \
perl-AnyEvent-WebSocket-Server"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-AnyEvent--Handle \
perl-AnyEvent--WebSocket--Client \
perl-Protocol--WebSocket--Handshake--Server \
perl-Try--Tiny"

inherit rpm
