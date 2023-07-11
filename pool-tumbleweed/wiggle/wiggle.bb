SUMMARY = "A Tool for Applying Patches with Conflicts"
DESCRIPTION = "Wiggle is a program for applying patches that 'patch' cannot apply due \
to conflicting changes in the original. \
 \
Wiggle will always apply all changes in the patch to the original. If \
it cannot find a way to cleanly apply a patch, it inserts it in the \
original in a manner similar to 'merge' and reports an unresolvable \
conflict."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "wiggle-1.3-1.12.aarch64.rpm"
RPM_HASH = "e9faac1f9afeabae9503f66b22e4319873eb0023b0a7474a7a449f248a52330a199af636062f116711c2228363aa44efc59eefc58012f476e8a22a12b1abe342"

RPROVIDES:${PN} += "wiggle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
