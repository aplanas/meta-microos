SUMMARY = "File listing as a tree"
DESCRIPTION = "Tree is a recursive directory listing command that produces a depth \
indented listing of files, which is colorized ala dircolors if the \
LS_COLORS environment variable is set and output is to tty."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "tree-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "c8b64bcd3446c1f1ee9df4501e7f210d51ff608f495d5d00bfa14598fefb75fbf1d389e078026a12f480d45f52de4a8637f39f58aed32804b2abcf4b8d2579c8"

RPROVIDES:${PN} += "tree"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
