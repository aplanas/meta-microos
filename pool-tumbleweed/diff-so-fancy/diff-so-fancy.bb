SUMMARY = "Strives to make your diffs human readable"
DESCRIPTION = "diff-so-fancy strives to make your diffs human readable instead of machine readable. This helps improve code quality and helps you spot defects faster."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "diff-so-fancy-1.4.4-1.1.noarch.rpm"
RPM_HASH = "8c297f20c628c5edfe9c653d9229b5edeb589a7e41c721da8fa893ced7929d4ec557aea15aa12172170b28cee377ec3672d754ee2b6fd311cf88d436959b3540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diff-so-fancy \
perl-DiffHighlight"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
