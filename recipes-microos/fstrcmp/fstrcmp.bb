SUMMARY = "Fuzzy string compare"
DESCRIPTION = "The fstrcmp package provides a library which may be used to make fuzzy \
comparisons of strings and byte arrays.  It also provides simple \
commands for use in shell scripts."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.D001"

RPM_NAME = "fstrcmp-0.7.D001-1.15.aarch64.rpm"
RPM_HASH = "3b04cfd29f151daa7175395bc2954ddae0267fb38996a280a70c013ff3d528f2094a4c9d5400f18fc77f94b85841d3e40854891aa18850742cfa1291a0185aea"

RPROVIDES:${PN} += "fstrcmp fstrcmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfstrcmp.so.0()(64bit)"

inherit rpm
