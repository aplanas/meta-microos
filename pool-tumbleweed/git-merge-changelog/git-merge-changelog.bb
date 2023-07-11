SUMMARY = "Git merge driver for ChangeLog files"
DESCRIPTION = "Git Merge Changelog is a git merge driver for changelogs that combines \
parallel additions to the changelog without generating merge conflicts. \
It can be enabled for specific files by setting appropriate git attributes."
LICENSE = "GPL-2.0-or-later"

PV = "git.20211127.db493d1ce"

RPM_NAME = "git-merge-changelog-git.20211127.db493d1ce-2.7.aarch64.rpm"
RPM_HASH = "c796e15fb2bc4e34cc0db7dd0a28873ddbb32811182caaa56c9a8badd0ff8c5097e5d18fc9d742f92061a7a26f32b73e4de59a4cd8ab7105166a87ddbfaf8cfc"

RPROVIDES:${PN} += "git-merge-changelog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
