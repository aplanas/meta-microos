SUMMARY = "A plugin to fake subprocess for pytest"
DESCRIPTION = "A pytest plugin to fake subprocess for pytest.  The plugin adds the \
``fake_process`` fixture (and ``fp`` as an alias).  It can be used it to \
register subprocess results so you won't need to rely on the real processes."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytest-subprocess-1.5.0-1.3.noarch.rpm"
RPM_HASH = "6f09e029b736a5b68ef5c2c5b11f4c70198398f1ed09a252af06c31798a45ff06429b2eabbe1b157af729e09e4be9dad9bc33ea7fa90cdf3bda2958a9b9df041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subprocess \
python3.11dist-pytest-subprocess \
python311-pytest-subprocess \
python3dist-pytest-subprocess"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
