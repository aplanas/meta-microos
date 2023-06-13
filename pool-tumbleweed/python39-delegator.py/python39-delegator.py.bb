SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-delegator.py-0.1.1-3.3.noarch.rpm"
RPM_HASH = "ff726a80521b484a383ee6eeeb319e7421a952ee23959d61afcd1196d2b3833aad916fba5150cbf58ce27c3ee609ec6b9e7016df63c09915a5b146b1bd47bbda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(delegator.py) \
python39-delegator.py \
python3dist(delegator.py)"

RDEPENDS:${PN} += "python(abi) \
python39-pexpect"

inherit rpm
