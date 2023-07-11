SUMMARY = "isort extension for flake8"
DESCRIPTION = "isort extension for flake8."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-flake8-imports-0.1.1-2.17.noarch.rpm"
RPM_HASH = "51d6187f6b16f4f55d6bdd32af60945a90dbb2050de1c13fa85f7be56802db7dae0b9881bfb9274e14cd858594b580e7984e4cdf2b892896e88f446c9f864604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-imports \
python3.11dist-flake8-imports \
python311-flake8-imports \
python3dist-flake8-imports"

RDEPENDS:${PN} += "python-abi \
python311-isort"

inherit rpm
