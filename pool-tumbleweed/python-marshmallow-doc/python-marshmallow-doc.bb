SUMMARY = "Documentation files for python-marshmallow"
DESCRIPTION = "HTML Documentation and examples for python-marshmallow."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python-marshmallow-doc-3.19.0-4.2.noarch.rpm"
RPM_HASH = "7dd59e993517a33b5485febe692d2eb1fee7f64c2e9d9325f2e60014edadb4f89379db0d34721eeec00d084ebb3cbc9de3a5b4428a067ec9e0f45b59428c2e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-marshmallow-doc \
python-marshmallow-docs"

RDEPENDS:${PN} += ""

inherit rpm
