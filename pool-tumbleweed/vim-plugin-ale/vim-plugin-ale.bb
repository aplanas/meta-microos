SUMMARY = "Asynchronous Lint Engine plugin for VIM"
DESCRIPTION = "ALE makes use of NeoVim and Vim 8 job control functions and timers \
to run linters on the contents of text buffers and return errors as \
text is changed in Vim. This allows for displaying warnings and \
errors in files being edited in Vim before files have been saved \
back to a filesystem. \
 \
In other words, this plugin allows you to lint while you type."
LICENSE = "BSD-2-Clause"

PV = "3.3.0"

RPM_NAME = "vim-plugin-ale-3.3.0-55.1.noarch.rpm"
RPM_HASH = "6b9bb33d435b4920c12e6cd15cf21887e103f1266af7e9aae964f2ff3402425ece1abaf4df335b3c13bbbc574e5eb618eda3b0fdb26d449ffcb9ea9783c41e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-ale"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
