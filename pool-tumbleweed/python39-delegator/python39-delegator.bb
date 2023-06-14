SUMMARY = "Python implementation of Ruby's delegate.rb"
DESCRIPTION = "Python implementation of Ruby's delegate.rb."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-delegator-0.0.3-2.8.noarch.rpm"
RPM_HASH = "f17a05ce892f58e28d0a1dfd14b8dcdf7e5a90a85c6c3842d387d60bb5fe70fa25ae166aee7e4b7b4682f5856fb3f20c1a4e135ff9d1c2ce0ebd7b1cf82f82d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-delegator \
python39-delegator \
python3dist-delegator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
