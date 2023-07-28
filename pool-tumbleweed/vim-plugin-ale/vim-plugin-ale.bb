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

RPM_NAME = "vim-plugin-ale-3.3.0-56.1.noarch.rpm"
RPM_HASH = "c00d899c016167a2525e9e641f62e26781f51e603768868481bcbc553189d9daccf0c2b2f414d483688044f870c3abafc30ed9f2647886238890e12e4a63dcd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-ale"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
