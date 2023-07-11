SUMMARY = "Documentation files for python-falcon"
DESCRIPTION = "HTML documentation including API documentation and changelog for python-falcon."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-falcon-doc-3.1.1-2.3.noarch.rpm"
RPM_HASH = "3d7868e4c2068c770c2623e86e2c0f21edbc4c8af5bfc679cd8785f62494ee451699f87c8d1b931fb9fec58f8d6cd1485bac61a5341bcc38cb7d1dbabf5da6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-falcon-doc \
python310-falcon-doc \
python311-falcon-doc \
python39-falcon-doc"

RDEPENDS:${PN} += ""

inherit rpm
