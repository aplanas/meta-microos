SUMMARY = "Detect perl's global phase on older perls"
DESCRIPTION = "This gives access to ${^GLOBAL_PHASE} in versions of perl that don't \
provide it. The built in variable will be used if it is available. \
 \
If all that is needed is detecting global destruction, \
Devel::GlobalDestruction should be used instead of this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003003"

RPM_NAME = "perl-Devel-GlobalPhase-0.003003-1.17.noarch.rpm"
RPM_HASH = "667afb654bb1499426e5dea4fb3e2e6adbe8c38c7d9b1c501618985b7cb1f7e747e2de7af3bcebd2ebe1fec465374a27689123e6946aec6efa68bf1467a6027f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--GlobalPhase \
perl-Devel-GlobalPhase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
