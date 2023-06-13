SUMMARY = "SMB for FUSE"
DESCRIPTION = "SMB for fuse (FUSE) is a filesystem which allows to mount a full \
Network Neighborhood with samba (Samba) and other SMB shares. It works \
like smbfs, but instead of accessing one share at a time, all computers \
and workgroups are accessible at once from a single filesystem mount, \
making network browsing just as easy as it is on Windows."
LICENSE = "GPL-2.0+"

PV = "0.8.7"

RPM_NAME = "fusesmb-0.8.7-128.29.aarch64.rpm"
RPM_HASH = "9594f824d4e9fbc86903171438cc4a6ac352f7b3178f1fbc5d51b5c3f7cf9b006b304637f9f5d16f2a9d6801732360cfe279595f44fb7a6b1d1eb39748c3831f"

RPROVIDES:${PN} += "fusesmb \
fusesmb(aarch-64)"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse.so.2()(64bit) \
libsmbclient.so.0()(64bit)"

inherit rpm
