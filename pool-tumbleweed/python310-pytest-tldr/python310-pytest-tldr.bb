SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python310-pytest-tldr-0.2.5-1.5.noarch.rpm"
RPM_HASH = "a77560e867edcbbe4a9579e353003f204f8281d56302bdf6fb2eb5f4f8c6927face041dd77248771396931e774e42ed3aebc7a2d64d5d2b5bf4a03aa9a78d9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-tldr \
python310-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
