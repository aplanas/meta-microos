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

RPM_NAME = "python310-flaky-3.7.0-3.1.noarch.rpm"
RPM_HASH = "696c8df4c2d4570e159a100e2a90b3d2b5917ef9b52a46a03b0abe3ac1c7b8194adb41309350e168274f1f72a5176b78a500228677e6b04389f6f1adb467a035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flaky \
python3.10dist-flaky \
python310-flaky \
python3dist-flaky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
