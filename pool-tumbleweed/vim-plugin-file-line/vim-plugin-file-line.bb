SUMMARY = "File-line plugin for Vim"
DESCRIPTION = "Plugin for vim to enable opening a file in a given line."
LICENSE = "GPL-3.0-only"

PV = "1.0+20161020"

RPM_NAME = "vim-plugin-file-line-1.0+20161020-56.1.noarch.rpm"
RPM_HASH = "2a302640d16f53f701c490a0b1aeb85ca1edb29ca59a70c679edde2ee3fb0b8c1dbc7427fa07c9b2c4cd59674cb0b7916182ff46decd3da1cbb88f7861f701f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-file-line"

RDEPENDS:${PN} += ""

inherit rpm
