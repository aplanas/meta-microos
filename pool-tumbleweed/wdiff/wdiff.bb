SUMMARY = "Display Word Differences Between Text Files"
DESCRIPTION = "wdiff compares two files and finds which words have been deleted or \
added to old_file to get new_file. A word is considered to be anything \
between whitespace. \
 \
Xwdiff is a handy X Window System front-end, based on Tcl/Tk."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "wdiff-1.2.2-8.7.aarch64.rpm"
RPM_HASH = "455956f1fb3e28230ecd092416fdc603261825ad61a4f16aa1ec130cc9581cc251cadae7fbb9269b8469808c4a857af83b322e1f5eb5a22cdc8bf12a7d201641"

RPROVIDES:${PN} += "wdiff"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
