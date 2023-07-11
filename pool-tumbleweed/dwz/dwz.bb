SUMMARY = "DWARF optimization and duplicate removal tool"
DESCRIPTION = "dwz optimizes DWARF debugging information contained in ELF shared \
libraries and executables for size, by replacing DWARF information \
representation with equivalent smaller representation where possible, \
and by reducing the amount of duplication using techniques from the \
DWARF standard appendix E - creating DW_TAG_partial_unit compilation \
units (CUs) for duplicated information and using DW_TAG_imported_unit \
to import it into each CU that needs it. \
 \
The tool handles DWARF 32-bit format debugging sections of versions \
2, 3 and 4 and GNU extensions on top of those, though using DWARF 4 \
or worst case DWARF 3 is strongly recommended. \
 \
When not using the -m option (multifile mode), GDB CVS snapshot (soon to be \
7.5) is sufficient, when using -m option, GDB from a git branch \
http://sources.redhat.com/git/?p=archer.git;a=shortlog;h=refs/heads/archer-tromey-dwz-multifile \
is needed."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "dwz-0.15-2.5.aarch64.rpm"
RPM_HASH = "47aeb732304f64459eb8b91d24c4c4d2fe7b9db6c87df80dce1d77b91b42fd721408f4ff88890e69c10295ace825f4167edf5573dc97004c8279ffe44a65d34a"

RPROVIDES:${PN} += "dwz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1"

inherit rpm
