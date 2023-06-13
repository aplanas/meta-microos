SUMMARY = "Documentation files for python-flake8"
DESCRIPTION = "Flake8 is a modular extensible source code checker. \
 \
This package provides documentation for python-flake8."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python-flake8-doc-6.0.0-2.1.noarch.rpm"
RPM_HASH = "7d7811061273fa427ee1422c01213595c93f8a939914b683f821da664d9cda67a2a92df39bf96cbf450c491b3c57bde6bcdf5514fd3fae38b41652ce6099f187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flake8-doc"

RDEPENDS:${PN} += ""

inherit rpm
