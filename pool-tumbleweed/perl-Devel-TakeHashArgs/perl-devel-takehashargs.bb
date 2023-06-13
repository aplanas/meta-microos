SUMMARY = "Make a Hash From @_ and Set Defaults in Subs While Checking That All Man[cut]"
DESCRIPTION = "The module is a short utility I made after being sick and tired of writing \
redundant code to make a hash out of args when they are passed as key/value \
pairs including setting their defaults and checking for mandatory \
arguments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Devel-TakeHashArgs-0.006-1.23.noarch.rpm"
RPM_HASH = "f85d5d136b456117b0e797ad965c28cc2384bf73d10a7fb0b4f7703ab0c52e463413a84f599fda4a8310db80861cdad51f7e81192234efcd68962fbbaded20be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::TakeHashArgs) \
perl-Devel-TakeHashArgs"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
