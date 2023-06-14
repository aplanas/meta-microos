SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python39-hatch-jupyter-builder-0.8.3-1.1.noarch.rpm"
RPM_HASH = "86182385fa53aa9e2f23b52fed184c6a1bf198014048b6e93ae2fc71e7b66bc7b3205767f648a8fbf87678cb84617eea91aab5511e7a4154f8a96f13c37959d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hatch-jupyter-builder \
python39-hatch-jupyter-builder \
python3dist-hatch-jupyter-builder"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python-abi \
python39-hatchling"

inherit rpm
