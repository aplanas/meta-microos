SUMMARY = "Development documentation for Engauge Digitizer"
DESCRIPTION = "This package contains the development documentation for Engauge Digitizer."
LICENSE = "GPL-2.0-or-later"

PV = "12.1"

RPM_NAME = "engauge-digitizer-devel-doc-12.1-2.5.noarch.rpm"
RPM_HASH = "f909db43c624180d0da132ce9880c94549fa833bc4f32863be41ab099280c7bbd3f4bf1abbb5640cefb8cb5c0d3362a487fa333e4d16f4147233483d48b17a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engauge-digitizer-devel-doc"

RDEPENDS:${PN} += "engauge-digitizer"

inherit rpm
