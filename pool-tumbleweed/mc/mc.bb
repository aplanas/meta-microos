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

PV = "4.8.29"

RPM_NAME = "mc-4.8.29-2.2.aarch64.rpm"
RPM_HASH = "53138e356f645922ff74de02eddb0568209b3503ff022aa8fe3e866ef4f82cadd9a7be3cca13d65a180610b7ee082e2e4d0c418f513e123c120cf1d73f0a24f7"

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
