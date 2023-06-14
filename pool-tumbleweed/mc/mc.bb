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

RPM_NAME = "mc-4.8.29-2.1.aarch64.rpm"
RPM_HASH = "dc0a852b97514b4c182c8866a90f571be8523fcc749b4999a048db7108ac072934c10a8da6a22ea141df0af45a0f3185ed832fdfaa1823d6c7707d77c1049d4e"

RPROVIDES:${PN} += "config-mc \
mc"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/python3 \
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
