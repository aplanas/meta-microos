SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "python310-pytest-twisted-1.14.0-1.1.noarch.rpm"
RPM_HASH = "bbb851939b07c398bc15a1f287b38e5207670f1cd0900b11c88990a0ef987d1a6881a9db832bfe1b34f3f2c5f32775e1540677098d9f6e8de860cf368890cf2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-twisted \
python3.10dist(pytest-twisted) \
python310-pytest-twisted \
python3dist(pytest-twisted)"

RDEPENDS:${PN} += "python(abi) \
python310-Twisted \
python310-decorator \
python310-greenlet \
python310-pytest"

inherit rpm
