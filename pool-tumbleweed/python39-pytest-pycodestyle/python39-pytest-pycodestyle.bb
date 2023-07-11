SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-pytest-pycodestyle-2.3.1-1.5.noarch.rpm"
RPM_HASH = "9694271fa504ae1b6c4a94189c21c75a35c70c1638ce847f05bb534de4b44d69ad586e4c49cb06b49ba683d3eac88077fe2f2443311b194f7915a811b5e46d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-pycodestyle \
python39-pytest-codestyle \
python39-pytest-pycodestyle \
python3dist-pytest-pycodestyle"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pycodestyle \
python39-pytest \
python39-setuptools"

inherit rpm
