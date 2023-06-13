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

RPM_NAME = "python311-flaky-3.7.0-3.1.noarch.rpm"
RPM_HASH = "da31335c8c812e305c00ea9cfdaaba55178d17f84a86733449efbaee160ac93bd6bda3d39b2363489ab44adc0a809ab33468363fe2d98cf64a0d446d8df06992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flaky) \
python311-flaky \
python3dist(flaky)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
