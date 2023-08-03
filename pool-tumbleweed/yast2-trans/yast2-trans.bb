SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "3b1361607a8aeb9dce8735a5f382873ccb0ddaf5db900550e7b4cea422bfd9b00d506d3d8ddc18dc746712dd08046f4e539d6c24ec150d85d75d3e27b6a3a26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
