SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python39-pscript-0.7.7-2.1.noarch.rpm"
RPM_HASH = "8c460d20d826e58117c3ee59f0ee3e770768271cea80ca937cda18a10b6398a53f04a92946064521a6761af677628ff143a4b05316178ed0f4cddb09c0b760ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pscript \
python39-pscript \
python3dist-pscript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
