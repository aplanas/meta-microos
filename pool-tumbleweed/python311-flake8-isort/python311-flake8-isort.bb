SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python311-flake8-isort-6.0.0-1.4.noarch.rpm"
RPM_HASH = "ed3e96c82c9bf038df35ab474dfe870659ad434fd4fb1ff9acdd599997e19733736b47f67f1dcf9f6ff61e320d1b9cec22f46e4ce2fc4b73a5468f383dc0325e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8-isort \
python311-flake8-isort \
python3dist-flake8-isort"

RDEPENDS:${PN} += "python-abi \
python311-flake8 \
python311-isort \
python311-testfixtures"

inherit rpm
