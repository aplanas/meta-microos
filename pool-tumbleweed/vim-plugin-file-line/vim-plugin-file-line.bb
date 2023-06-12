SUMMARY = "File-line plugin for Vim"
DESCRIPTION = "Plugin for vim to enable opening a file in a given line."
LICENSE = "GPL-3.0-only"

PV = "1.0+20161020"

RPM_NAME = "vim-plugin-file-line-1.0+20161020-55.1.noarch.rpm"
RPM_HASH = "0dceccdd95de326f89e35a356504265a4a582c4016f09bb95f0b6baf00fdb05aa96700f177e9b6dea5059f51a98d36ea5490d48adfc594d298dce6235b388532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-file-line"
RDEPENDS:${PN} += ""

inherit rpm
