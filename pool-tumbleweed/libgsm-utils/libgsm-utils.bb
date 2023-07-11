SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains binaries for a GSM speech compressor, verified against the \
ETSI standard test patterns. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
(residual pulse excitation/long term prediction) coding at 13 kbit/s. \
GSM 06.10 compresses frames of 160 13-bit samples (8 kHz sampling \
rate) into 260 bits. \
 \
The front-end is modeled after the historic compress(1) utility."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libgsm-utils-1.0.22-1.3.aarch64.rpm"
RPM_HASH = "28b60777ce0b6ce03479c8f1917214b8bae1158dd60df4d8a753aa41e7d43c3d61d3d2a44867b565c95bcefa469a7fac073605008e93fd8cfda6420145bb99a6"

RPROVIDES:${PN} += "libgsm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsm.so.1"

inherit rpm
