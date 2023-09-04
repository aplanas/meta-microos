SUMMARY = "Generic CRC functions"
DESCRIPTION = "The *Digest::CRC* module calculates CRC sums of all sorts. It contains \
wrapper functions with the correct parameters for CRC-CCITT, CRC-16, CRC-32 \
and CRC-64, as well as the CRC used in OpenPGP's ASCII-armored checksum."
LICENSE = "SUSE-Public-Domain"

PV = "0.24"

RPM_NAME = "perl-Digest-CRC-0.24-1.6.aarch64.rpm"
RPM_HASH = "94ff7a064f7af9ba4bc8ee8d18f411480e3f6c18971caa6d968eaab9a1a69369fa1331e33561b66a03e61c7f0176dd08bcf3ba44cb38463c7586aeda6df44ae5"

RPROVIDES:${PN} += "perl-Digest--CRC \
perl-Digest-CRC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
