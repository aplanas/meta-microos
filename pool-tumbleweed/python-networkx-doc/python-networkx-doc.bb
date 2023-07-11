SUMMARY = "Documentation for python-networkx"
DESCRIPTION = "Documentation and examples for python-networkx."
LICENSE = "BSD-3-Clause"

PV = "2.8.8"

RPM_NAME = "python-networkx-doc-2.8.8-2.1.noarch.rpm"
RPM_HASH = "e5ba81fd8a27c6e89be29ae7dd0222020f106f215fdbc638434d810893cb0ff0ae23aa45da6e8784aa1c2fc24a0db238669239e68b4e2f7aeae470dda537d4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-networkx-doc \
python310-networkx-doc \
python311-networkx-doc \
python39-networkx-doc"

RDEPENDS:${PN} += ""

inherit rpm
