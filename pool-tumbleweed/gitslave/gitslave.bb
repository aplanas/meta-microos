SUMMARY = "Creates a group of related repositories"
DESCRIPTION = "Creates a group of related repositories—a superproject repository and \
a number of slave repositories—all of which are concurrently developed on and \
on which all git operations should normally operate; so when you branch, each \
repository in the project is branched in turn."
LICENSE = "SUSE-Gitslave"

PV = "2.0.2"

RPM_NAME = "gitslave-2.0.2-9.17.noarch.rpm"
RPM_HASH = "f56d65f876a8ce3e0cb528142e5d6fa9d433571d0afb40b2522492cdd324a62353d9dbcc8355c3995d0b5ac19e58a341c8705baccdf0b46d63d83ee743b29d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitslave"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl"

inherit rpm
