SUMMARY = "WebSocket client for AnyEvent"
DESCRIPTION = "This class provides an interface to interact with a web server that \
provides services via the WebSocket protocol in an AnyEvent context. It \
uses Protocol::WebSocket rather than reinventing the wheel. You could use \
AnyEvent and Protocol::WebSocket directly if you wanted finer grain \
control, but if that is not necessary then this class may save you some \
time. \
 \
The recommended API was added to the AnyEvent::WebSocket::Connection class \
with version 0.12, so it is recommended that you include that version when \
using this module. The older version of the API has since been deprecated \
and removed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.55"

RPM_NAME = "perl-AnyEvent-WebSocket-Client-0.55-1.1.noarch.rpm"
RPM_HASH = "21dab1faed8e0e98281eeba985280e15c3316518a13e32a637d2ea74507fdcf2f5f14e67e495cba417007353b1a4f8b3c8513935da2a72b3fc68a0fa9cd8cb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AnyEvent::WebSocket::Client) \
perl(AnyEvent::WebSocket::Connection) \
perl(AnyEvent::WebSocket::Message) \
perl-AnyEvent-WebSocket-Client"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(AnyEvent) \
perl(AnyEvent::Connector) \
perl(Moo) \
perl(PerlX::Maybe) \
perl(Protocol::WebSocket) \
perl(URI) \
perl(URI::ws)"

inherit rpm
