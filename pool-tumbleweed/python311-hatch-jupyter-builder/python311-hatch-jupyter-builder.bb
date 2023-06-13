SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python311-hatch-jupyter-builder-0.8.3-1.1.noarch.rpm"
RPM_HASH = "8086960f1c3a5cc309f23242ae61d52ccde8ef9049c9f2a575090930fe339507c2b926ada5c7d6e3ca4b2823f57b03e4d2ee0ec36bb8265edac5ba566be0e1f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch-jupyter-builder) \
python311-hatch-jupyter-builder \
python311-hatch_jupyter_builder \
python3dist(hatch-jupyter-builder)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-hatchling"

inherit rpm
