SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-pylint-venv-3.0.2-1.1.noarch.rpm"
RPM_HASH = "21bbe8103d068f005c90921b54eb53ef7efb925dbbc60a02af98d31a0326f1b6e6eb0c003cf527be5bc35c5f325f0e1e9789eda29650971b5e135d5988d21973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylint-venv \
python310-pylint-venv \
python3dist-pylint-venv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
