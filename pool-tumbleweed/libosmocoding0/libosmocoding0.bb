SUMMARY = "GSM/GPRS/EDGE transcoding routines library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
The following data types are currently supported: xCCH, PDTCH (CS 1-4 \
and MCS 1-9), TCH/FR, TCH/HR, TCH/AFS, RCH/AHS, RACH and SCH."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocoding0-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "abc4093ddceea1a70d3c0d8b96bbc2a461a23902096978d50a9be122067b5bd3217b3bf60f59f7f10a7b9eb3010fcb37a969a4df087597b3957f2893d1f4a2ab"

RPROVIDES:${PN} += "libosmocoding.so.0 \
libosmocoding0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocodec.so.0 \
libosmocore.so.20 \
libosmogsm.so.18"

inherit rpm
