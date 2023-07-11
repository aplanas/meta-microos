SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2022.1"

RPM_NAME = "python310-python-docs-theme-2022.1-1.13.noarch.rpm"
RPM_HASH = "4a87cff7676fb2e2c533090f810a4b8ae6514f3e22e405991e7d7f7fe75497b4ed4a2a79e018ecef77d1f03d83ddcbf9990c4f123db0868a2ba05998d7e6c270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-docs-theme \
python310-python-docs-theme \
python3dist-python-docs-theme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
