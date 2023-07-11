SUMMARY = "Library for Writing Preformatted Data onto Optical Media"
DESCRIPTION = "Libburn is a library for writing preformatted data onto optical media such as \
CD, DVD, BD (Blu-Ray) and also offers a facility for reading data blocks from \
its drives without using the normal block device I/O."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libburn4-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "a5c7ec65896f5a1035757d4226137359eb6f7172d356c89cc3ff7103b1eac38c753742a0cb726aecceba7243a402d64fba769092ecdbf0aa0a9e255995832245"

RPROVIDES:${PN} += "libburn.so.4 \
libburn4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
