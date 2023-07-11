SUMMARY = "Define Web Services in Pyramid"
DESCRIPTION = "Provides helpers to build & document Web Services with Pyramid."
LICENSE = "MPL-2.0"

PV = "6.0.1"

RPM_NAME = "python310-cornice-6.0.1-1.8.noarch.rpm"
RPM_HASH = "651cfe3f0521479074639b2df04f5410650b8d440a9cf8540e699ab5ddc7fa030488eba04d52926dc0c4ca09d80491b5e25e895062f0c8986076a78fb87f2537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cornice \
python310-cornice \
python3dist-cornice"

RDEPENDS:${PN} += "python-abi \
python310-pyramid \
python310-venusian"

inherit rpm
