SUMMARY = "Creates a group of related repositories"
DESCRIPTION = "Creates a group of related repositories—a superproject repository and \
a number of slave repositories—all of which are concurrently developed on and \
on which all git operations should normally operate; so when you branch, each \
repository in the project is branched in turn."
LICENSE = "SUSE-Gitslave"

PV = "2.0.2"

RPM_NAME = "gitslave-2.0.2-9.18.noarch.rpm"
RPM_HASH = "70f7473499335950966f48603a81abcfd16f4e5cf09975479421d630aea1ccc092206207dd79dc1cc67533005d6b0e180edf80fc1f5870b77eadc132aa656fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitslave"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl"

inherit rpm
