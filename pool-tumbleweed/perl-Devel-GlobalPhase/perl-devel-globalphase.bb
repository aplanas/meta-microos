SUMMARY = "Detect perl's global phase on older perls"
DESCRIPTION = "This gives access to ${^GLOBAL_PHASE} in versions of perl that don't \
provide it. The built in variable will be used if it is available. \
 \
If all that is needed is detecting global destruction, \
Devel::GlobalDestruction should be used instead of this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003003"

RPM_NAME = "perl-Devel-GlobalPhase-0.003003-1.16.noarch.rpm"
RPM_HASH = "c725050f08fdab6ff381fe6c91b5dba43264989f82a515b073aec2518f643b7b4a387c0b6323a9f19346c2e188ae663d3fdcf43532092f232be5381857241f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::GlobalPhase) \
perl-Devel-GlobalPhase"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
