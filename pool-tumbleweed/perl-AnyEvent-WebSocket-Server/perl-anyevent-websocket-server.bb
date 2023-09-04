SUMMARY = "WebSocket server for AnyEvent"
DESCRIPTION = "This class is an implementation of the WebSocket server in an AnyEvent \
context. \
 \
  * Currently this module supports WebSocket protocol version 13 only. See at \
https://tools.ietf.org/html/rfc6455 for detail."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10"

RPM_NAME = "perl-AnyEvent-WebSocket-Server-0.10-1.12.noarch.rpm"
RPM_HASH = "6215cd5ea8bbd8d0d8c81d7d77834ef3bcd3d7bb1c2e0277c456a4504c85cbc0c816ed19b889408622e63f7257094ce05c9372094480e40be5e22e69b990b339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--WebSocket--Server \
perl-AnyEvent-WebSocket-Server"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AnyEvent--Handle \
perl-AnyEvent--WebSocket--Client \
perl-Protocol--WebSocket--Handshake--Server \
perl-Try--Tiny"

inherit rpm
