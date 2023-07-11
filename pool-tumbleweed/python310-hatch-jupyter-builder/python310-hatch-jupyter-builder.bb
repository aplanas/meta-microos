SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python310-hatch-jupyter-builder-0.8.3-1.3.noarch.rpm"
RPM_HASH = "f1af1f2623f53abdc409bce09eea74f5b730e75bd3c88a9d64c5fbcab25cc41a9dfb57edb8024f9fb98d8d30a258c07df9fbd63783df4c1212ec27668f5137ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hatch-jupyter-builder \
python310-hatch-jupyter-builder \
python3dist-hatch-jupyter-builder"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-hatchling"

inherit rpm
