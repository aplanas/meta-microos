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

RPM_NAME = "libgsm-utils-1.0.22-1.2.aarch64.rpm"
RPM_HASH = "a1b3407cf6cabd256dc9acb6db584b041c66bd226aa965daa402eb9fb32fe9e4851725d89dc33b6b5a537dffe1369330cd620ead0588d87d615684e4b03337ab"

RPROVIDES:${PN} += "libgsm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsm.so.1"

inherit rpm
