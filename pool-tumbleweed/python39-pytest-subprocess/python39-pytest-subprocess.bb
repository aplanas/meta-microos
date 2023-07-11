SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytest-subprocess-1.5.0-1.3.noarch.rpm"
RPM_HASH = "5152877202feaa19866627a6d43ba0350ab2bccc37f17c2ebebfefcd5e9754a39a561ebeda5aab617ec543e73a445522b3f97dc3f89087c2d83e9bca64018632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-subprocess \
python39-pytest-subprocess \
python3dist-pytest-subprocess"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
