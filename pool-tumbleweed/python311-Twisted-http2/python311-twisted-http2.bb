SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-http2-22.10.0-8.1.noarch.rpm"
RPM_HASH = "ef3a09f0f13d4fe686c5493e7d2b86f11282deac6e9a839d6333f5303970d8667bd6962d6ce3efebebe57617f29810bdcac44fdf853445f35325d45252877564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-http2 \
python311-Twisted-http2"

RDEPENDS:${PN} += "python311-Twisted \
python311-h2 \
python311-priority"

inherit rpm
