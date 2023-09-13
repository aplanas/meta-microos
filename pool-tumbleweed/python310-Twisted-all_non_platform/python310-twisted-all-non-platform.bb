SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-all_non_platform-22.10.0-8.1.noarch.rpm"
RPM_HASH = "43c09eecd0784ae2447a6e436635cf56a013aa922f6aaeb2f54045c29323f1bc096b7b85c1dad95024b4baf60778799af1748a32ca6129627ed14cdf922bcbfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-all-non-platform"

RDEPENDS:${PN} += "python310-PyHamcrest \
python310-Twisted-conch \
python310-Twisted-contextvars \
python310-Twisted-http2 \
python310-Twisted-serial \
python310-Twisted-tls"

inherit rpm
