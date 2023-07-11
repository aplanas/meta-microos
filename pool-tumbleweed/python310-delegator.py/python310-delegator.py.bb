SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-delegator.py-0.1.1-3.5.noarch.rpm"
RPM_HASH = "c25e02d793f433f88465cd5ca67a4e2017f32aab7a68db5c876f2bb147c6732ac6ae7bcadec9d0be452165806e471dc61fe1e03191c05f8187d7f18ae5a5c7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-delegator.py \
python310-delegator.py \
python3dist-delegator.py"

RDEPENDS:${PN} += "python-abi \
python310-pexpect"

inherit rpm
