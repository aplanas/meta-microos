SUMMARY = "Plugin integrating isort in flake8"
DESCRIPTION = "Use `isort`_ to check if the imports on your python files are sorted the way you expect."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python310-flake8-isort-6.0.0-1.6.noarch.rpm"
RPM_HASH = "220327ad1d2dffc1128903050b1fd5251cd508caa88dc367663d2ebf44b0ab3db7ed18be9e8252f949d44e6ebb11aff28dee927708b18fe3ce7bc1071f6ed1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-isort \
python310-flake8-isort \
python3dist-flake8-isort"

RDEPENDS:${PN} += "python-abi \
python310-flake8 \
python310-isort \
python310-testfixtures"

inherit rpm
