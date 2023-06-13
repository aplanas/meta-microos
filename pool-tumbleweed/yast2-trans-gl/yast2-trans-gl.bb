SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-gl-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "89360e359d58c0f645a7e627588040298550532be0198889d66e3db1d75191e5458646a698aed40461f93c9d6a61606caf62c9c1612693ef3bd8cd2c9f0ed930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:gl) \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
