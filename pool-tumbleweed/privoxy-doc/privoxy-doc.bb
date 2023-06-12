SUMMARY = "The documentation of Privoxy"
DESCRIPTION = "Documentation files for the Privoxy: The Internet Junkbuster - HTTP \
Proxy Server. A non-caching HTTP proxy server that runs between a web \
browser and a web server and filters contents as described in the \
configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.34"

RPM_NAME = "privoxy-doc-3.0.34-1.3.noarch.rpm"
RPM_HASH = "49daa10da683553c80b3b4db77ff2eb605c66872537ee3012c93bab4e832088a89616e8f1a800bccfb29100684ade43487473f3861d1ed7db3b96a061e56822a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "privoxy-doc"
RDEPENDS:${PN} += "privoxy"

inherit rpm
