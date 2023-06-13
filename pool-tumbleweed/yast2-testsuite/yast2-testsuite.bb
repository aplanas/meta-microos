SUMMARY = "YaST2 - Testsuite"
DESCRIPTION = "This is a package for the YaST2 modules testsuite preparation and \
execution."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-testsuite-4.6.0-1.1.noarch.rpm"
RPM_HASH = "810ef282b2e5232e0746004213284cef85a15a37b9731dbb36848b23b0bf46c835f10a3d57785f602c01f48790ece3fcd7552890b1d4cd79f13312b9bc7c48de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-testsuite"

RDEPENDS:${PN} += "dejagnu \
expect \
yast2-core"

inherit rpm
