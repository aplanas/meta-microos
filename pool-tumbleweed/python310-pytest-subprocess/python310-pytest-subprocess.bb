SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytest-subprocess-1.5.0-1.3.noarch.rpm"
RPM_HASH = "fda211c72fafb3d8a139eb5d0c57ee161f49ae5eaea27e72d5c54a250f8fec1894b38a6acf3569805bebdc3ce2a7bcc58404f5376496b66a9852bd7e3bd0a1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-subprocess \
python310-pytest-subprocess \
python3dist-pytest-subprocess"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
