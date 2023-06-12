SUMMARY = "Git remote helper for repositories stored on Keybase"
DESCRIPTION = " \
A git remote helper that allows storing Git repositories using Keybase. \
Repositories can be completely private or bound to a team. \
Repositories using this remote helper use the scheme keybase://."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-git-6.0.2-3.4.aarch64.rpm"
RPM_HASH = "f9ce366866f271f51c50d429f256d982b1d9cf5445fd7d7c4332869da1f39bcfe16f482d3bcb17aec4bacf8f3c7cda6622332466734e97bbc731976af0ca274d"

RPROVIDES:${PN} += "kbfs-git \
kbfs-git(aarch-64)"
RDEPENDS:${PN} += "kbfs \
keybase-client"

inherit rpm
