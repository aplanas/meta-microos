SUMMARY = "A line-oriented text editor"
DESCRIPTION = "GNU ed is a line-oriented text editor. It is used to create, display, \
modify and otherwise manipulate text files, both interactively and via \
shell scripts. A restricted version of ed, red, can only edit files in \
the current directory and cannot execute shell commands. Ed is the \
'standard' text editor in the sense that it is the original editor for \
Unix, and thus widely available. For most purposes, however, it is \
superseded by full-screen editors such as GNU Emacs or GNU Moe."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.19"

RPM_NAME = "ed-1.19-1.4.aarch64.rpm"
RPM_HASH = "9de37bb90dfee7f8fe698aff111a4553c01372e2b298959503c16a35076110b1770e7c47e69af41ba1bc9ddd45038e75eced8c580af60fd9ac9fe588f052cd9c"

RPROVIDES:${PN} += "ed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
