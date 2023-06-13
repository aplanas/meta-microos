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

RPM_NAME = "ed-1.19-1.3.aarch64.rpm"
RPM_HASH = "9fda36f95d396cf076b24387593fb85d9451efbc47f61538cedbe07d76b3683e0038845f6118cebc6dd2cf6a0e79859191095e2204ac849e411a9a52b2393361"

RPROVIDES:${PN} += "ed \
ed(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
