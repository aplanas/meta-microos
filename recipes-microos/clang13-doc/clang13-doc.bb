SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-doc-13.0.1-8.1.noarch.rpm"
RPM_HASH = "2c828653648a5e2fab45853cdace7c371e84de15776a3c888d9f8ca40b1ca7630f0cd236e660ec3bc8b100e6e84c5e8f56dc2dcbe62211c44135b84e2688692d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider clang13-doc"
RDEPENDS:${PN} += ""

inherit rpm
