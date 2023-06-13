SUMMARY = "Yet Another Framework for Experiments"
DESCRIPTION = "The package yafe offers a generic framework to conduct \
scientific experiments."
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python310-yafe-1.0.3-2.8.noarch.rpm"
RPM_HASH = "0bfc769361472bb8036719f62ddf5d2955e2db5ad30579043e713895d869c97677a090d3d3111b5017b44b77cffb5a24b2ebab681b1a41eaa079ba89bc1f4e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yafe \
python3.10dist(yafe) \
python310-yafe \
python3dist(yafe)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy"

inherit rpm
