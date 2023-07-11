SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-pygments-pytest-2.3.0-2.3.noarch.rpm"
RPM_HASH = "57837088237fbecd975e9c5ad325b5423738a7b75d4988f7dae8e5280dfba5e9e5ae5f1e162ea284fc44130885272e0dfd7b618b5d3943c572b981ee60baaa7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-pytest \
python39-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python39-pygments \
python39-pytest"

inherit rpm
