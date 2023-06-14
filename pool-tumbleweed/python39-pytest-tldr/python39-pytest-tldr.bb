SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python39-pytest-tldr-0.2.5-1.3.noarch.rpm"
RPM_HASH = "0d7131131be6d2d012278a9d171113e435e2b42ca31e2ade47c22024c2ba19727ea764ec515a9debcdf5ff9d30e3ab3feae568230916c6e7728d5ab273c33f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-tldr \
python39-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
