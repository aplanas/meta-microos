SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python310-pytest-sugar-0.9.7-2.1.noarch.rpm"
RPM_HASH = "4b116430644ae8fd764da7fc0e3ef523f7d7632ca56eba9cfd425e9a60e6506bc62a8162ef7cb945ff47b36e46fb390ca3c5ac323bbe2da5e327bbde8c514f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-sugar \
python310-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-termcolor"

inherit rpm
