SUMMARY = "Include Files mandatory for Development"
DESCRIPTION = "This package contains include files to develop LADSPA plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17"

RPM_NAME = "ladspa-devel-1.17-1.8.noarch.rpm"
RPM_HASH = "c47d63da738fd34da8766adab3bc710dbd0152cd0ecac96b8b6100818e0ce7bf7259f60348dd95f32b6fb989579daaa7005ca2a99bd64ab4aa6dea9e51e0ee35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ladspa-devel"
RDEPENDS:${PN} += ""

inherit rpm
