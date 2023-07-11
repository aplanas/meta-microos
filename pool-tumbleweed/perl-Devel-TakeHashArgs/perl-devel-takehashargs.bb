SUMMARY = "Make a Hash From @_ and Set Defaults in Subs While Checking That All Man[cut]"
DESCRIPTION = "The module is a short utility I made after being sick and tired of writing \
redundant code to make a hash out of args when they are passed as key/value \
pairs including setting their defaults and checking for mandatory \
arguments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Devel-TakeHashArgs-0.006-1.24.noarch.rpm"
RPM_HASH = "d53eb405d436fc0b8cfdc98471f6076ff5dcb2e6cf02c47e94fa01019c971c92d4c59a040a00a9fc0d61f5db981e73d5bb567037c9c580848d037be9baa9e404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--TakeHashArgs \
perl-Devel-TakeHashArgs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
