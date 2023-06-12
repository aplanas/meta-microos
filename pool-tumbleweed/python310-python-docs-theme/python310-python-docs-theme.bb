SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2022.1"

RPM_NAME = "python310-python-docs-theme-2022.1-1.11.noarch.rpm"
RPM_HASH = "939cbe62aa352580b897baf267550943a2b6db9b3be7216c035c4bd0ea872076899708c4675e059bf8c5b0296786d0fc9df9616adc1398d2bb56ec467cecabb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-docs-theme \
python3.10dist(python-docs-theme) \
python310-python-docs-theme \
python3dist(python-docs-theme)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
