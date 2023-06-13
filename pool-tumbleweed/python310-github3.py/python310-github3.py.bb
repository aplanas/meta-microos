SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python310-github3.py-3.2.0-1.5.noarch.rpm"
RPM_HASH = "8395e4d4248dba59f53610f3b017beeba9bc17e50b41cd130e4e31dea774e8ba905aa4d754d804c76a39e95670453a36e51d3b7238fbab6870e0eaee44d11e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-github3.py \
python3.10dist(github3.py) \
python310-github3.py \
python3dist(github3.py)"

RDEPENDS:${PN} += "python(abi) \
python310-PyJWT \
python310-jwcrypto \
python310-python-dateutil \
python310-requests \
python310-uritemplate"

inherit rpm
