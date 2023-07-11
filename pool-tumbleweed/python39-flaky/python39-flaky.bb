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

RPM_NAME = "python39-flaky-3.7.0-3.2.noarch.rpm"
RPM_HASH = "d82ab4906b2b3870db79e3ffd0f1c1ca0a9de03af07f7b9312058d929e86e99e700347d1ac454231361742635088369cfa6bcba57ccad93e7e0ec751f0659068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flaky \
python39-flaky \
python3dist-flaky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
