SUMMARY = "Display Word Differences Between Text Files"
DESCRIPTION = "wdiff compares two files and finds which words have been deleted or \
added to old_file to get new_file. A word is considered to be anything \
between whitespace. \
 \
Xwdiff is a handy X Window System front-end, based on Tcl/Tk."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "wdiff-1.2.2-8.8.aarch64.rpm"
RPM_HASH = "d394aadf642d5efeb4c9db7ecdccc55ab1072d57a538ef4b02bf96b655e5887838ff09374f9c80dbe8716eb37298c099d8883d4886f2009b352c020897a71b08"

RPROVIDES:${PN} += "wdiff"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
