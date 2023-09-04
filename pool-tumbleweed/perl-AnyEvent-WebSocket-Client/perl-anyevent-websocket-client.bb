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

RPM_NAME = "perl-AnyEvent-WebSocket-Client-0.55-1.3.noarch.rpm"
RPM_HASH = "f8114ca5b2f9652a03ec1632137c4f7db2fce7fe5afab8e4ff4c85d7b1190dd1e7cf27c65b716d2b1520a48b651b66ce8fb72d69e9ef0b1fe18409d7e6aa8604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--WebSocket--Client \
perl-AnyEvent--WebSocket--Connection \
perl-AnyEvent--WebSocket--Message \
perl-AnyEvent-WebSocket-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-AnyEvent \
perl-AnyEvent--Connector \
perl-Moo \
perl-PerlX--Maybe \
perl-Protocol--WebSocket \
perl-URI \
perl-URI--ws"

inherit rpm
