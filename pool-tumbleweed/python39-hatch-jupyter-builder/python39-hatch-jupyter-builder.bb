SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python39-hatch-jupyter-builder-0.8.3-1.3.noarch.rpm"
RPM_HASH = "622666cac1f420b16a8a5bb5158b81c1d1150bba9181222026715173d41224a64f0f81b4f17e92b0a5adbe43494da44a6fb32ae77ac48c15c6fcd7b039a7fa48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-jupyter-builder \
python39-hatch-jupyter-builder \
python3dist-hatch-jupyter-builder"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-hatchling"

inherit rpm
