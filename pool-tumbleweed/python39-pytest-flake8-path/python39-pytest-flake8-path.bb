SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytest-flake8-path-1.5.0-1.1.noarch.rpm"
RPM_HASH = "2a499f9f49c81a2a51245cad91c88f954e91101c5064d8516be0dd5251a520c8a7ccd9f9221da00c5d0c62563facc003536e644fd3f2ba57c628e178fafb5c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-flake8-path \
python39-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python39-flake8 \
python39-pytest"

inherit rpm
