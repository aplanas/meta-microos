SUMMARY = "Detect perl's global phase on older perls"
DESCRIPTION = "This gives access to ${^GLOBAL_PHASE} in versions of perl that don't \
provide it. The built in variable will be used if it is available. \
 \
If all that is needed is detecting global destruction, \
Devel::GlobalDestruction should be used instead of this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003003"

RPM_NAME = "perl-Devel-GlobalPhase-0.003003-1.18.noarch.rpm"
RPM_HASH = "5415e15eebd9cb2583e9f894e62ab847c15cf7f02cb68b92639c8ff9d3eb0a6dcc697c0db3505bc4692103d89096866df39056f3c93e40e9b3dea8efcec8bbcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--GlobalPhase \
perl-Devel-GlobalPhase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
