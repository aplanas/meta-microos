SUMMARY = "Library for Writing Preformatted Data onto Optical Media"
DESCRIPTION = "Libburn is a library for writing preformatted data onto optical media such as \
CD, DVD, BD (Blu-Ray) and also offers a facility for reading data blocks from \
its drives without using the normal block device I/O."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libburn4-1.5.6-2.1.aarch64.rpm"
RPM_HASH = "9cb5e596472ef437fbb4c5a75ff7c13f814d0ba4e660f62a920427f48270a21959a6c19d2cbf90edce5e0f971e6cf8f7f45825b9153f3c9ef4455d67899fc237"

RPROVIDES:${PN} += "libburn.so.4 \
libburn4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
