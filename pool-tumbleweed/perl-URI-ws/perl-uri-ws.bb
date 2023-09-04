SUMMARY = "WebSocket support for URI package"
DESCRIPTION = "After this module is installed, the URI package provides the same set of \
methods for WebSocket URIs as it does for HTTP ones. For secure WebSockets, \
see URI::wss."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-URI-ws-0.03-1.13.noarch.rpm"
RPM_HASH = "3fc75378d660adfa0c98ecffd842592a9e279b44ef95849e6d775cdc4f1a2b4bfeb8566e8592f679dc9257881aca7c81a6704af187f5834b247410fce8b72f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--ws \
perl-URI--wss \
perl-URI-ws"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI"

inherit rpm
