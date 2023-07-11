SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python311-hatch-jupyter-builder-0.8.3-1.3.noarch.rpm"
RPM_HASH = "9cdb1a12f5cacf5be319f5100688d40144e24ffc81b0e494c47a34f48abd992406ce93b9dd3c42ed36d969879f413c5fcbafc995fafc990a4918add9e11a1344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-jupyter-builder \
python3.11dist-hatch-jupyter-builder \
python311-hatch-jupyter-builder \
python3dist-hatch-jupyter-builder"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-hatchling"

inherit rpm
