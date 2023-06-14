SUMMARY = "Strives to make your diffs human readable"
DESCRIPTION = "diff-so-fancy strives to make your diffs human readable instead of machine readable. This helps improve code quality and helps you spot defects faster."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "diff-so-fancy-1.4.3-1.4.noarch.rpm"
RPM_HASH = "7be2e236c990d80e3b18dae55fbd496f2e69aa48dca5292643a3721eb0d99e96def41e15a521b25dd841ab71fd77b0af5e10ebd3310bed55db47b71037a20831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diff-so-fancy \
perl-DiffHighlight"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
