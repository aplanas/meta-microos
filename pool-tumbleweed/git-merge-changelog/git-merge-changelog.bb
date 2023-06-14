SUMMARY = "Git merge driver for ChangeLog files"
DESCRIPTION = "Git Merge Changelog is a git merge driver for changelogs that combines \
parallel additions to the changelog without generating merge conflicts. \
It can be enabled for specific files by setting appropriate git attributes."
LICENSE = "GPL-2.0-or-later"

PV = "git.20211127.db493d1ce"

RPM_NAME = "git-merge-changelog-git.20211127.db493d1ce-2.6.aarch64.rpm"
RPM_HASH = "f5a723db589ca0ee32a8d7c09868bbeab19533722458e14c231f802817adb018d49ec838da42ec4c2f285ed56a98e4d2da06da8f2c36aa0c4ba4e257971272c0"

RPROVIDES:${PN} += "git-merge-changelog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
