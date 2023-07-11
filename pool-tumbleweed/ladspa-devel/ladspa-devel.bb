SUMMARY = "Include Files mandatory for Development"
DESCRIPTION = "This package contains include files to develop LADSPA plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17"

RPM_NAME = "ladspa-devel-1.17-1.9.noarch.rpm"
RPM_HASH = "817d30f46d39cc7ac7c19dbd7505965c54e5f85a40c33ba1d4aa97c7db38d7491429fb17732af0bb93de6981d59143670520ec35d087c4284a3a4ed2890d10bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ladspa-devel"

RDEPENDS:${PN} += ""

inherit rpm
