SUMMARY = "Midnight Commander"
DESCRIPTION = "GNU Midnight Commander (also referred to as MC) is a user shell much \
like the (in)famous Norton Commander with text-mode full-screen \
interface. It can be run on the OS console, in xterm and other \
terminal emulators. \
 \
GNU Midnight Commander allows you to manage files while making most of \
your screen and giving you a clear representation of the filesystem, yet \
it's simple enough to be run over a telnet or ssh session. \
 \
MC needs several other programs for its various extfs extensions, e.g. \
isoinfo (from mkisofs) or xorriso for the iso:// extension."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.30"

RPM_NAME = "mc-4.8.30-1.1.aarch64.rpm"
RPM_HASH = "4288b0857770eae132fd5f3a63bf07593b4e8819f579931c54ff9ffb3e61fe4d5c0a88ba4e3e4afb86d3f0754c53f8eadc56bd4a1fc9bf586fe80f1b1b67be97"

RPROVIDES:${PN} += "config-mc \
mc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libe2p.so.2 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgpm.so.2 \
libslang.so.2 \
libssh2.so.1 \
permissions"

inherit rpm
