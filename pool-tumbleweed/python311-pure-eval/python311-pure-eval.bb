SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-pure-eval-0.2.2-2.3.noarch.rpm"
RPM_HASH = "de2515eed30c4e0a9d4f610affe9fd02b90bb668544fe5ede43bcab4c3a401bacbc8f852a2854140da1c0fb7509f37973418a9e29740f4ab4d0c5c9b4e6332be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-eval \
python3.11dist-pure-eval \
python311-pure-eval \
python3dist-pure-eval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
