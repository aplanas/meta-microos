SUMMARY = "I/O error aware data recovery and copying utility"
DESCRIPTION = "GNU ddrescue is a data recovery tool. It copies data from one file or \
block device (hard disk, CD-ROM, etc.) to another, trying hard to \
rescue data in case of read errors. \
 \
It is more memory and time efficient than dd_rescue+dd_rhelp on disks \
with more than a few hundred bad sectors."
LICENSE = "GPL-2.0-or-later"

PV = "1.27"

RPM_NAME = "gnu_ddrescue-1.27-1.3.aarch64.rpm"
RPM_HASH = "08568de62a7e3cd867554611f92cd246cf6c036a189f061b05ec7cab224603a26297053fd765d509c5371c8b3376e604694dbaa5f236ab94cdb79bce60b566be"

RPROVIDES:${PN} += "gnu_ddrescue \
gnu_ddrescue(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm