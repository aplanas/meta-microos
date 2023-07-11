SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-delegator.py-0.1.1-3.5.noarch.rpm"
RPM_HASH = "19dc15af6188dd3167beebfe805d7e5f633e9517fb89aba058342886b2a05bbbdfd22b4dd9971f3cd6ba83fe533c83ac8957a017e3de0e3fab407c31264693c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-delegator.py \
python39-delegator.py \
python3dist-delegator.py"

RDEPENDS:${PN} += "python-abi \
python39-pexpect"

inherit rpm
