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
sleuthkit"

RDEPENDS:${PN} += "/usr/bin/perl \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libewf.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtsk.so.19 \
libtsk19 \
mac-robber"

inherit rpm
