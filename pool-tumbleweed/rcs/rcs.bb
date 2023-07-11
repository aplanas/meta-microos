SUMMARY = "Revision Control System"
DESCRIPTION = "RCS, the Revision Control System, manages multiple revisions of files. \
RCS can store, retrieve, log, identify, and merge revisions. It is \
useful for files that are frequently revised, for example: programs, \
documentation, graphics, and papers."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.1"

RPM_NAME = "rcs-5.10.1-2.8.aarch64.rpm"
RPM_HASH = "c1169e79103c1585ea44e2a5906e06a0e7a026b3a2074f6a5f0f1f594af4d37bdd131dd954aef4d92e297a46c31108f56596e6e1a7f7f6d7f19e8f714293a3b1"

RPROVIDES:${PN} += "rcs"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
