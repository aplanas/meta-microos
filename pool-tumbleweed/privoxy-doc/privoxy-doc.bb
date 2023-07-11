SUMMARY = "The documentation of Privoxy"
DESCRIPTION = "Documentation files for the Privoxy: The Internet Junkbuster - HTTP \
Proxy Server. A non-caching HTTP proxy server that runs between a web \
browser and a web server and filters contents as described in the \
configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.34"

RPM_NAME = "privoxy-doc-3.0.34-1.4.noarch.rpm"
RPM_HASH = "0c0c4b1ab7846e875cbfc67f8e47f810f7643a56d22324dcb67033fd0eef83881123e25a04702911bf8e6bc8df4a10470019c63bdaa3cf73420d859351eddec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "privoxy-doc"

RDEPENDS:${PN} += "privoxy"

inherit rpm
