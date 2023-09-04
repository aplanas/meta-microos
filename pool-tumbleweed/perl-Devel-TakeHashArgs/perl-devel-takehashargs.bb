SUMMARY = "Make a Hash From @_ and Set Defaults in Subs While Checking That All Man[cut]"
DESCRIPTION = "The module is a short utility I made after being sick and tired of writing \
redundant code to make a hash out of args when they are passed as key/value \
pairs including setting their defaults and checking for mandatory \
arguments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Devel-TakeHashArgs-0.006-1.25.noarch.rpm"
RPM_HASH = "213efd1c8f553a8408a883afeb33acaee581dd78c755ae99a8b20f4153e6273a7d53dc6d182e5288df8d283bea1d8ae7db3106e42c783f77b428b5b243c2890e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--TakeHashArgs \
perl-Devel-TakeHashArgs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
