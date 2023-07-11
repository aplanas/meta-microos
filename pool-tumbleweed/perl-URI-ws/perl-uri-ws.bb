SUMMARY = "WebSocket support for URI package"
DESCRIPTION = "After this module is installed, the URI package provides the same set of \
methods for WebSocket URIs as it does for HTTP ones. For secure WebSockets, \
see URI::wss."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-URI-ws-0.03-1.12.noarch.rpm"
RPM_HASH = "34ff9cb4ae07f3d79a3ebf02946cfaf5f584a5350a1d736129b769bfb9bfb7c90f40b1f1e4c05206cff5c9eada9686d9a375b6a4fc3589826c4d9017b8760660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--ws \
perl-URI--wss \
perl-URI-ws"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI"

inherit rpm
