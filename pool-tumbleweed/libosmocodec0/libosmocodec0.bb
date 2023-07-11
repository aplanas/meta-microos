SUMMARY = "GSM 06.10, 06.20, 06.60, 06.90 codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs: \
 \
* GSM 06.10 Full Rate (FR) codec \
* GSM 06.20 Half Rate (HR) codec \
* GSM 06.60 Enhanced Full Range (EFR) codec \
* GSM 06.90 Adaptive Multi-Rate (AMR) codec"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocodec0-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "e06b950a7080d7b0235e7e003288ddf84af8bf9fdb28b2c89005485957459239c36756343542de15214950439d94b36ba58f882549241ee1150920210095d353"

RPROVIDES:${PN} += "libosmocodec.so.0 \
libosmocodec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
