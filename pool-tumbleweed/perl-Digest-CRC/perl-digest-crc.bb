SUMMARY = "Generic CRC functions"
DESCRIPTION = "The *Digest::CRC* module calculates CRC sums of all sorts. It contains \
wrapper functions with the correct parameters for CRC-CCITT, CRC-16, CRC-32 \
and CRC-64, as well as the CRC used in OpenPGP's ASCII-armored checksum."
LICENSE = "SUSE-Public-Domain"

PV = "0.24"

RPM_NAME = "perl-Digest-CRC-0.24-1.5.aarch64.rpm"
RPM_HASH = "d4008231b7f3d921f23ce414949efe3000db9d82f8c183bd6b4a41fec0855947fbfdf46d530b4aa36ee3fb6d15846e03fdb1a0e7f3e7fe302da9959918d80cc3"

RPROVIDES:${PN} += "perl-Digest--CRC \
perl-Digest-CRC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
