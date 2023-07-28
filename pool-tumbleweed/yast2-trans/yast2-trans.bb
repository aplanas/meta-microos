SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "6139898918ae38514acfe0a7a3e9400388490b1649c398b3672d5e6771656b321f9160d441d02ce4785f3142725c3f4c7d45906f096c066e9ff95d921cba2310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
