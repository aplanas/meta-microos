SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-click-threading-0.5.0-1.10.noarch.rpm"
RPM_HASH = "8d4adb02159c181d2089c43c8f9ea3e82a62264bb86830774891f57c404684bdcb51c3236dcb6c53f613755246f4748585bc95d42e2c6a5b98c2bbb9115eca68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-threading \
python310-click-threading \
python3dist-click-threading"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
