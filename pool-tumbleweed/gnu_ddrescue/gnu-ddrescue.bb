SUMMARY = "I/O error aware data recovery and copying utility"
DESCRIPTION = "GNU ddrescue is a data recovery tool. It copies data from one file or \
block device (hard disk, CD-ROM, etc.) to another, trying hard to \
rescue data in case of read errors. \
 \
It is more memory and time efficient than dd_rescue+dd_rhelp on disks \
with more than a few hundred bad sectors."
LICENSE = "GPL-2.0-or-later"

PV = "1.27"

RPM_NAME = "gnu_ddrescue-1.27-1.4.aarch64.rpm"
RPM_HASH = "6ad5a3c88be87801654a0ba7155230e456efdc92ac227bfa923947ff74a7b794651ae4739528be51a7eba34e0f976985974c245bfc85ab46b1dd393495db81b7"

RPROVIDES:${PN} += "gnu-ddrescue"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
