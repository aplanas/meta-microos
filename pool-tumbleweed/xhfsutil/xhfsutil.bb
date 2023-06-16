SUMMARY = "Tcl/Tk Front-End for hfsutils"
DESCRIPTION = "A Tcl interface for scriptable access to volumes and  Tk-based \
front-end for browsing and copying files through a variety of transfer \
modes (MacBinary, BinHex, text, etc.) for hfsutils."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "xhfsutil-3.2.6-1245.13.aarch64.rpm"
RPM_HASH = "9d09164b46663bffddfeb14fd2909deba65d9977928ce3b140c913fae0322263a9d26a8e6f14e5654f90d4ac55d97240f34b367c1bad51a38c1e88b78f012c82"

RPROVIDES:${PN} += "xhfsutil"

RDEPENDS:${PN} += "/usr/bin/sh \
hfsutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
