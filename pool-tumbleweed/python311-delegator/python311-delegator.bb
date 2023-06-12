SUMMARY = "Python implementation of Ruby's delegate.rb"
DESCRIPTION = "Python implementation of Ruby's delegate.rb."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-delegator-0.0.3-2.8.noarch.rpm"
RPM_HASH = "07db5f8660dd6544dd1b5229ab6d555c8fe15f9df4d2d00d7ac6cd1cb9280d7b02e28ebb9f5791eb7c6f186646231dc2cf4abc0b5f0e51cb209d4230a16c09ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(delegator) \
python311-delegator \
python3dist(delegator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
