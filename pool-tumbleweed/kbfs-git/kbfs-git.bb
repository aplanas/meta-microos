SUMMARY = "Git remote helper for repositories stored on Keybase"
DESCRIPTION = " \
A git remote helper that allows storing Git repositories using Keybase. \
Repositories can be completely private or bound to a team. \
Repositories using this remote helper use the scheme keybase://."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "kbfs-git-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "536f0a5f864ab08367bb4ec3d2558160bd92cf0ce96dbf2f475b4f3018ac4775e51ef2f39cdb0bfb9241b89eadb318b4fe4a24ae2646f616a35bc5626fad1f50"

RPROVIDES:${PN} += "kbfs-git"

RDEPENDS:${PN} += "kbfs \
keybase-client"

inherit rpm
