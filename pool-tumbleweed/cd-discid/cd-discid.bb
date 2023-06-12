SUMMARY = "Utility to get CDDB discid information"
DESCRIPTION = "cd-discid is a backend utility to get CDDB discid information for a \
CD-ROM disc.  It was originally designed for cdgrab (now abcde), but \
can be used for any purpose requiring CDDB data."
LICENSE = "GPL-2.0+"

PV = "1.4"

RPM_NAME = "cd-discid-1.4-1.26.aarch64.rpm"
RPM_HASH = "10493310061b097e31a02c33e10a472452fe9f1ce1efcd2c4f81582430661e4a62beda5cc5869df83e78b9510aa476439c30fc41c15e2b12146b06b24cca4d17"

RPROVIDES:${PN} += "cd-discid \
cd-discid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
