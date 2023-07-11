SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains the library for a GSM speech compressor. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
(residual pulse excitation/long term prediction) coding at 13 kbit/s. \
GSM 06.10 compresses frames of 160 13-bit samples (8 kHz sampling \
rate) into 260 bits."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libgsm1-1.0.22-1.3.aarch64.rpm"
RPM_HASH = "df45cd1ae25d19f1b87853377f7403367191d3a9c76cc277c9246edbb4d89b183f3ae734a0a17dfeafd2f8c7be59a1083a7e5893da95c25c99872d569442a8b2"

RPROVIDES:${PN} += "libgsm.so.1 \
libgsm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
