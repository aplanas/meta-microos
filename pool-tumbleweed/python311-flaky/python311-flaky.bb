SUMMARY = "Plugin for nose or py.test that automatically reruns flaky tests"
DESCRIPTION = "Flaky is a plugin for py.test that automatically reruns flaky tests. \
 \
Ideally, tests reliably pass or fail, but sometimes test fixtures must rely on components that aren't 100% \
reliable. With flaky, instead of removing those tests or marking them to @skip, they can be automatically \
retried. \
 \
For more information about flaky, see `this presentation <http://opensource.box.com/flaky/>`_."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python311-flaky-3.7.0-3.2.noarch.rpm"
RPM_HASH = "4881291bfa034e8f9146681f55907e10091d1204b1a98db56425f5423df3e021b56b0ade7aa8edd8e6cca8e09658b06467619daf0b2c2c261348d8ae8c66e502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flaky \
python3.11dist-flaky \
python311-flaky \
python3dist-flaky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
