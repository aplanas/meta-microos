SUMMARY = "Multithreaded Click apps made easy"
DESCRIPTION = "Utilities for multithreading in click <http://click.pocoo.org/>. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-click-threading-0.5.0-1.8.noarch.rpm"
RPM_HASH = "3e5a9d34968d144de643184b838a34cfabc2ec623033ecc8783cb427b1d0ee9a0768f276378c5c867ddebd0e4e41366dae030e815d245b5002ad2bb267716e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-threading) \
python311-click-threading \
python3dist(click-threading)"

RDEPENDS:${PN} += "python(abi) \
python311-click"

inherit rpm
