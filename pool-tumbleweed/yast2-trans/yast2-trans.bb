SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "0ea569953c473bee5af3852a9f5f5b7d081532b074276a5418efeba5eca74cc6df166ce234eab14dd6c3a6be59ea9f7ae6519494e9ec7100bfe0d0b2fc70d070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
