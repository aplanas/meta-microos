SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python310-pytest-sugar-0.9.7-1.3.noarch.rpm"
RPM_HASH = "bd39b8194b642a9319e8065270b6739115c1ca4d3ca69c1d03f9d2807af096d78041da4f13750d6f20dacf7ef1766706be275692a811d1bf0fca95a43df4eb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-sugar \
python310-pytest-sugar \
python3dist-pytest-sugar"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-termcolor"

inherit rpm
