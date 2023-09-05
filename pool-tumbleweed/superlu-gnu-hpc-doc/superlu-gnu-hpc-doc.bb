SUMMARY = "Dependency package for superlu_6_0_1-gnu-hpc-doc"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package superlu-gnu-hpc-doc provides the dependency to get binary package superlu_6_0_1-gnu-hpc-doc. \
When this package gets updated it installs the latest version of superlu_6_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu-gnu-hpc-doc-6.0.1-1.1.noarch.rpm"
RPM_HASH = "7709bf1405332e04177d6d6ebbdcfccfa26902b6c344c52f9751766165149cf363750c4c49e6a23e362684e95aff72357c2701ffd3a18cc6431229ac749be02f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-gnu-hpc-doc"

RDEPENDS:${PN} += "superlu-6-0-1-gnu-hpc-doc"

inherit rpm
