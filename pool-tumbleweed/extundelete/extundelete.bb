SUMMARY = "Recovery tool for ext4 and ext3 filesystems"
DESCRIPTION = "extundelete is a utility that can recover deleted files from an ext3 or ext4 \
partition. extundelete uses the information stored in the partition's journal \
to attempt to recover a file that has been deleted from the partition. There is \
no guarantee that any particular file will be able to be undeleted, so always \
try to have a good backup system in place, or at least put one in place after \
recovering your files!"
LICENSE = "GPL-2.0-only"

PV = "0.2.4"

RPM_NAME = "extundelete-0.2.4-2.19.aarch64.rpm"
RPM_HASH = "f69344a3e7bed654c7acfe6a79e219b28e96db649d1c84d34bb327c34baeb9879844c0a42dcb233a229ec534ad00fe2cbdd15186faa8dabf7a1a3d6016982e62"

RPROVIDES:${PN} += "extundelete \
extundelete(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libext2fs.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
