SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-click-threading-0.5.0-1.10.noarch.rpm"
RPM_HASH = "84e480b23d49476be440238d1398f4eeee7b38f4b0ccdb2d8e1b70164ef273afa4e1d56b8384e46b704ad8d34601b0dc2ec2034eac9f618d56de146a542e481f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-threading \
python3.11dist-click-threading \
python311-click-threading \
python3dist-click-threading"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
