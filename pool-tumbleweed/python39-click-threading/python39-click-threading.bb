SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-click-threading-0.5.0-1.10.noarch.rpm"
RPM_HASH = "09ce27fda7128e1e0c8970ceb6bdbee8aa683ca4aecf5cb8b7335d64ecd1a83ff6a5af1af43f9c11b2b451a084c121ce0e3c808f53a4765a0d8e48f963446df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-threading \
python39-click-threading \
python3dist-click-threading"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
