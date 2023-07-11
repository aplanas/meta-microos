SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-pytest-flake8-path-1.3.0-1.4.noarch.rpm"
RPM_HASH = "72894e199bbdf451e1b6de73e0485aa32694181fa97c6efb906419ba038502d2b708a741d73581ddf23612b89545aaebff0d08859165bfd14d5dcd10d768dda0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-flake8-path \
python39-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python39-flake8 \
python39-pytest"

inherit rpm
