SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-flake8-docstrings-1.6.0-1.7.noarch.rpm"
RPM_HASH = "3c56bcb7f56bab9cde138d5c27da623be03cf7e8b3969493f64f3fa447e4f7e63c6b4baa5ad26fcd10f7a6cc7eaed68fe3f0e0626b163c69677a4e697807a1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-docstrings \
python310-flake8-docstrings \
python3dist-flake8-docstrings"

RDEPENDS:${PN} += "python-abi \
python310-flake8 \
python310-flake8-polyfill \
python310-pydocstyle"

inherit rpm
