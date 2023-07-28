SUMMARY = "Markdown support for vim"
DESCRIPTION = "Syntax highlighting, matching rules and mappings for the original Markdown and \
extensions."
LICENSE = "MIT"

PV = "2.0.0+20220926"

RPM_NAME = "vim-plugin-markdown-2.0.0+20220926-56.1.noarch.rpm"
RPM_HASH = "dbb29846933c47054d2fc621f7d78fc351f6248b2a1c6b1c575fb10178e1bbcbd1cf548ccf11d197c7e46a5983ee596833fa05585b0d31615782d82825172c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
