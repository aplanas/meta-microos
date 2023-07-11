SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-delegator.py-0.1.1-3.5.noarch.rpm"
RPM_HASH = "6fc9108e516a320edb4358be8278dd59aa5b14704b0ee0606abd0d2a79e9530652fe0c1f7126735a9f1ca76bc377dee318da2097c925b5700e49ab61f56c8081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-delegator.py \
python3.11dist-delegator.py \
python311-delegator.py \
python3dist-delegator.py"

RDEPENDS:${PN} += "python-abi \
python311-pexpect"

inherit rpm
