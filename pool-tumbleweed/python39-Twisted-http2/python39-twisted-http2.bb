SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-http2-22.10.0-8.1.noarch.rpm"
RPM_HASH = "2e61fe02ea876634bf244988e93283266d2248684cd59760ac8e7ef1202f7662839cde1837e423e573c1622e6a6d76bed4c3b93b9a837d22aa5c874e01c89410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-http2"

RDEPENDS:${PN} += "python39-Twisted \
python39-h2 \
python39-priority"

inherit rpm
