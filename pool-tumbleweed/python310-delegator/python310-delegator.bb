SUMMARY = "Python implementation of Ruby's delegate.rb"
DESCRIPTION = "Python implementation of Ruby's delegate.rb."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-delegator-0.0.3-2.8.noarch.rpm"
RPM_HASH = "35e4f0f7a60a7b6f4a56b210fbafa4b5ef96bd3bf93fc614fbd962f725f5fceb834c0a17a14b0a29b084261e5c952697d2a50cdb7a6d0d2e36e6ca80be38983e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-delegator \
python3.10dist-delegator \
python310-delegator \
python3dist-delegator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
