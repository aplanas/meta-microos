SUMMARY = "Show changes since the last save"
DESCRIPTION = "Show changes made to current buffer since the last save. This plugin is based \
from an example in the Hacking Vim book. The differences are that this \
functionality is in the form of a plugin, is a bit more robust, and can be \
toggled."
LICENSE = "Vim"

PV = "0.6+g346dae2"

RPM_NAME = "vim-plugin-diffchanges-0.6+g346dae2-56.1.noarch.rpm"
RPM_HASH = "7caac9fefc546b701a5d026aaaadab00e498eb41945b97eef912b530631b871b86ef7437bef8c39baf5d91346fe106e7ba074a4258649e0c3e0330d869750623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-diffchanges"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
vim"

inherit rpm
