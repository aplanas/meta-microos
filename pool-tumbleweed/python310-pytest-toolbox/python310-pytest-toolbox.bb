SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-pytest-toolbox-0.4-4.1.noarch.rpm"
RPM_HASH = "fa85f4ff73951e9a9b5dc119a4a2a0fdcbd923e8e2dd27d2ed19d428ce745b7b05eaf582bffde5f06b6bd58acb28008000a82a887f700280eb429fa2151c0a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-toolbox \
python310-pytest-toolbox \
python3dist-pytest-toolbox"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
