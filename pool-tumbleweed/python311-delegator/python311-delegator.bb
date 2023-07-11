SUMMARY = "Python implementation of Ruby's delegate.rb"
DESCRIPTION = "Python implementation of Ruby's delegate.rb."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-delegator-0.0.3-2.10.noarch.rpm"
RPM_HASH = "a4fed6944b0a987e9d1bb5b75bd2803ecc893023d67a0d6be7066f16eb50212ae6302b866693e088d32b2437e4b8eafb8267803fef7f5f781d101d38342b493b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-delegator \
python3.11dist-delegator \
python311-delegator \
python3dist-delegator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
