SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-delegator.py-0.1.1-3.3.noarch.rpm"
RPM_HASH = "a27947b84c095afd6fd9a4fa56c2665d4f1865bed6d335d98f850ebc4a9c0a640c44bb1ec012ccd69339a364d82935c9337a2055c84599843af02b51823fd0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-delegator.py \
python3.10dist-delegator.py \
python310-delegator.py \
python3dist-delegator.py"

RDEPENDS:${PN} += "python-abi \
python310-pexpect"

inherit rpm
