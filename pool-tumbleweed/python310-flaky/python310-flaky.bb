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

RPM_NAME = "python310-flaky-3.7.0-3.2.noarch.rpm"
RPM_HASH = "c349366be620d543100ac233540c104ca4c5e3f75989131a7ffe8b022cf466ed81e4c90712801e073ac214e71665c657a1ec6e5b560891f3e27386d2f4ac0d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flaky \
python310-flaky \
python3dist-flaky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
