SUMMARY = "C/C++ Development"
DESCRIPTION = "Tools and libraries for software development using C/C++ and other derivative \
of the C programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-C-C++-devel_C_C++-20170319-4.2.noarch.rpm"
RPM_HASH = "ac8b0d4ff5d408a3b23d40e6ec61fca8a4ca30284ac593dcae3e53c5814bde4d25cb4a86e4f144584a1886ec55f7d7e9f14066e0929fa3c77da731e80e54613e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-C-C++-devel-C-C++"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
pattern-"

inherit rpm
