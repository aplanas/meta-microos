SUMMARY = "Python implementation of Ruby's delegate.rb"
DESCRIPTION = "Python implementation of Ruby's delegate.rb."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-delegator-0.0.3-2.10.noarch.rpm"
RPM_HASH = "f6e71466a1cf6005fca78e6008fb36a8567fa2bef641710f2c623b30aa60498de2e610db0dbbe512b63b0cb6d46ac594f2c17758e26870a6f17a72cadb3d5572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-delegator \
python310-delegator \
python3dist-delegator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
