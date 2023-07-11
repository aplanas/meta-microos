SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains the development kit for the libgsm speech compressor. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
coding at 13 kbit/s. GSM 06.10 compresses frames of 160 13-bit \
samples (8 kHz sampling rate) into 260 bits. \
 \
This implementation turns frames of 160 16-bit linear samples into \
33-byte frames (1650 bytes/s) and has been verified against the ETSI \
standard test patterns."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libgsm-devel-1.0.22-1.3.aarch64.rpm"
RPM_HASH = "e1a9b478cbd907e7aad8230c3b250c63c7c9057e0f200132473ed32bec13e4a0b3a0de12f1ac9235cbe60a79cfc4a95575025620408628e867ae5f5940cdd6a2"

RPROVIDES:${PN} += "libgsm-devel"

RDEPENDS:${PN} += "libgsm1"

inherit rpm
