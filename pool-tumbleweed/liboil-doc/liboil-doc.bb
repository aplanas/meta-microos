SUMMARY = "Documentation for the library of Optimized Inner Loops"
DESCRIPTION = "This package provides documentation for liboil, a library of \
functions that are optimized for various CPUs."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-doc-0.3.17-26.7.noarch.rpm"
RPM_HASH = "7830977810bf5aed5646cee5eff30a425e2467927b936a20cc54e94d5f03745eefbd1dfa3a6d91087360e1c8c384d5debed3785a7b01fd8882a5d5f409e5e257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liboil-doc"
RDEPENDS:${PN} += ""

inherit rpm
