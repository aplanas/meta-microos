SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python39-process-tests-2.1.2-2.2.noarch.rpm"
RPM_HASH = "a189c7b21d0550b1e9b5ba02603e718be1adc8a60e416e5972bb2e79dcb60565be6e29fff0d8dacb95867963407cf0cc08574eaedc153cfe88a0e3a3782f427b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-process-tests \
python39-process-tests \
python3dist-process-tests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
