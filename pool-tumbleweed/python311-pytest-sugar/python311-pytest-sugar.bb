SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python311-pytest-sugar-0.9.7-2.1.noarch.rpm"
RPM_HASH = "9bccfe53eaf01fe05336894614e64ac615b6ee585c621369a69c0726b471002d19f23f37367c6d48522d12dcc0e4d67f29d1e0210eaa07ca6568e4ee103cba7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-sugar \
python3.11dist-pytest-sugar \
python311-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-termcolor"

inherit rpm
