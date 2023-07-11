SUMMARY = "WebSocket server for AnyEvent"
DESCRIPTION = "This class is an implementation of the WebSocket server in an AnyEvent \
context. \
 \
  * Currently this module supports WebSocket protocol version 13 only. See at \
https://tools.ietf.org/html/rfc6455 for detail."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-AnyEvent-WebSocket-Server-0.10-1.11.noarch.rpm"
RPM_HASH = "e9f62521c9d949b56ac0ee9539bbae0df68f0b9c98b51728de7170af898bc332b300a7af9149844198084f1adc9bbb59bec6f6ca44d4451e0651939956fcf88e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--WebSocket--Server \
perl-AnyEvent-WebSocket-Server"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-AnyEvent--Handle \
perl-AnyEvent--WebSocket--Client \
perl-Protocol--WebSocket--Handshake--Server \
perl-Try--Tiny"

inherit rpm
