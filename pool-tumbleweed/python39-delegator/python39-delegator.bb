SUMMARY = "Python implementation of Ruby's delegate.rb"
DESCRIPTION = "Python implementation of Ruby's delegate.rb."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-delegator-0.0.3-2.10.noarch.rpm"
RPM_HASH = "bc155eee239871e58f6a4e96174b77afa711fc2c676ba9cf122d266f176387688784422efc6f3e9dd0fd553bf91364c4410ef85b600419fde25eff40b22532d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-delegator \
python39-delegator \
python3dist-delegator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
