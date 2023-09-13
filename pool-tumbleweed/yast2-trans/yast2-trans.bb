SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "5484b0f1e15646ff4537f821f58533a3b06c249a459cd24c3d2d292d0ad596456aed6670a476291f16206fbeb9ca2b06efa090e9fdbabf37674d2edeada91b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
