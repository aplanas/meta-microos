SUMMARY = "A GIT URL parser for Python"
DESCRIPTION = "git-url-parse is a GIT URL parser."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-git-url-parse-1.2.2-1.14.noarch.rpm"
RPM_HASH = "dbc16a0dabf2b8f062b2e0b949b04b73288abf014dc20cab645b1422ca0d00d799ca037e5a514e8b6f5023e36689ad06805e9d0400e547a8dad7d99d8e53f13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-git-url-parse \
python39-git-url-parse \
python3dist-git-url-parse"

RDEPENDS:${PN} += "python-abi \
python39-pbr"

inherit rpm
