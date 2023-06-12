SUMMARY = "Tools for file system and volume forensic analysis"
DESCRIPTION = "The Sleuth Kit (TSK) is a collection of UNIX-based command line tools that \
allow you to investigate a computer. The current focus of the tools is the \
file and volume systems and TSK supports FAT, Ext2/3, NTFS, UFS, \
and ISO 9660 file systems"
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "sleuthkit-4.12.0-1.3.aarch64.rpm"
RPM_HASH = "9ea1797fb98d77e98ab2322e3941d0231ba8700457b54737a4810fb375b77014b4baf9fddedb214b12439568bcdb774100d3ebbb2ab08849d16b886ea57b33fb"

RPROVIDES:${PN} += "fiwalk \
sleuthkit \
sleuthkit(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
file \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtsk.so.19()(64bit) \
libtsk19 \
mac-robber"

inherit rpm
