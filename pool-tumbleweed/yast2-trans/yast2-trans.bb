SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "20f9523859c2f3bc6ac34de477a43a75ca2863de88113f79fb2023ca7eb9f5b4a8afe21437cc6e4a4aa54c390a5a82e12687932a0ccb177408ee3808f7d05627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
