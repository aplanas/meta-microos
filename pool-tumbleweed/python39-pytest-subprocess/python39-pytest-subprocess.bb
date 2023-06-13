SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytest-subprocess-1.5.0-1.1.noarch.rpm"
RPM_HASH = "4779f9fc3454c211234bfc8ce771651dc21e2bf11051207a58d06ce57e0084871a6ecee109593785a360873571fb4d447a763b02dfd4b00bd6337e42fd8eceb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-subprocess) \
python39-pytest-subprocess \
python3dist(pytest-subprocess)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
