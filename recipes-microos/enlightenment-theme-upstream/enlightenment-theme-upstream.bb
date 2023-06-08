SUMMARY = "Default Enlightenment theme"
DESCRIPTION = "For use with upstream branding, when using openSUSE themes, when using \
openSUSE themes Use the Flat theme instead."
LICENSE = "BSD-2-Clause & LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-theme-upstream-0.21.0-30.6.aarch64.rpm"
RPM_HASH = "af390785c11f065a1d488b6e64963409972ee28c9b62a737a66cb62e13f87d21c40bfdc703039976951cf2621405a8f0c0d9392731b02fa26d1bf16ec2df7e5a"

RPROVIDES:${PN} += "enlightenment-theme enlightenment-theme-dft enlightenment-theme-upstream enlightenment-theme-upstream(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
