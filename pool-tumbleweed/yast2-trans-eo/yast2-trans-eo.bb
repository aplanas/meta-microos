SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-eo-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "bfad4995437a4b384fc106d39e0e84adbe85deecbcf5f8b8290a6907aa53f3d04c30414db08f801abe8246aa2dcdf884416ee64b4fa2b20e60d3bcee22698817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
