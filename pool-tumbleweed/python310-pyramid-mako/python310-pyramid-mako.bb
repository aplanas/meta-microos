SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-pyramid-mako-1.1.0-3.10.noarch.rpm"
RPM_HASH = "cd8ad71638f83ca8e79bdf6409053daab9ff0341f2e86013c5a399a7633a05b763bb1cc989e931f51693ab87a803a9ffb08419f6c4e4ecd85984b90fb0875d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyramid-mako \
python310-pyramid-mako \
python3dist-pyramid-mako"

RDEPENDS:${PN} += "python-abi \
python310-Mako \
python310-pyramid"

inherit rpm
