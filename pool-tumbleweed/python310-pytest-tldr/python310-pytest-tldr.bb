SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python310-pytest-tldr-0.2.5-1.3.noarch.rpm"
RPM_HASH = "9378d99c83cc2ab4e62788b6ff630ab47ad7d57f44d83d11c7b41195ab417c60f47adf9afc56e6eb41282d13b65f2dbb449c8ef480d4c394a716b7a22a00e99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tldr \
python3.10dist-pytest-tldr \
python310-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
