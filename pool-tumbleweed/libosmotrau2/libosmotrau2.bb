SUMMARY = "Osmocom GSM TRAU (E1/RTP) library"
DESCRIPTION = "This library implements the Transcoder and Rate Adaptation Unit (TRAU) for \
GSM systems. \
The TRAU enables the use of lower rates (32, 16 or 8 kbps) over the \
A-bis interface instead of the 64 kbps ISDN rate for which the Mobile \
Switching Center (MSC) is designed."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libosmotrau2-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "f7c219ef912e24762ca18e25e5be2c96b46d09c5d6f5b70ff0c5a7c216afe8b94dcb4650b54b03a6328ffe9732918564374a380ec468632752ac40a80c7f9d88"

RPROVIDES:${PN} += "libosmotrau.so.2 \
libosmotrau2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libortp.so.15 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
