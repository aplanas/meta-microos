SUMMARY = "Use nvim as a pager"
DESCRIPTION = "Using neovim as a pager to view man pages, git diffs, whatnot with neovim's syntax highlighting and mouse support."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "nvimpager-0.12.0-1.1.noarch.rpm"
RPM_HASH = "a9a772fe62f3d587463955cb0e3eac391c270e75bfbcaf7cfa5e3293f0295d131a75d220d01c59c5a1a44185143608e1a7241fec90e8259b965c979cd8bde40e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvimpager"

RDEPENDS:${PN} += "/usr/bin/bash \
lua54 \
neovim"

inherit rpm
