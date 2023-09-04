SUMMARY = "Git remote helper for repositories stored on Keybase"
DESCRIPTION = " \
A git remote helper that allows storing Git repositories using Keybase. \
Repositories can be completely private or bound to a team. \
Repositories using this remote helper use the scheme keybase://."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "kbfs-git-6.2.2-2.1.aarch64.rpm"
RPM_HASH = "f5995f03cf9e4ccc30f1440e847c5439a7cf0a5fc197a7ae8c30430a49822b86b5fea85432d0dd9608a251d21cb309c33bb26374404fc54d237a552934feae4a"

RPROVIDES:${PN} += "kbfs-git"

RDEPENDS:${PN} += "kbfs \
keybase-client"

inherit rpm
