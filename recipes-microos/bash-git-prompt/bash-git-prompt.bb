SUMMARY = "Informative git prompt for bash and fish"
DESCRIPTION = "A bash prompt that displays information about the current git repository. In particular the branch name, difference with remote branch, number of files staged, changed, etc. \
 \
This package will automatically enable the git prompt for bash after \
install. It will disable the prompt accordingly after uninstall."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "bash-git-prompt-2.7.1-2.9.noarch.rpm"
RPM_HASH = "b32f11c853db32583906ff27f5831b995b0150651dabdcf002cb1ba24133015bb63c3c062f5f84c38e86fa0bfe948adeeae9dd350bd07f37e2354922775a2fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-git-prompt"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch fillup git-core"

inherit rpm
