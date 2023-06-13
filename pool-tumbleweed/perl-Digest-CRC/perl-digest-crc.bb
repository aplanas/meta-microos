SUMMARY = "Generic CRC functions"
DESCRIPTION = "The *Digest::CRC* module calculates CRC sums of all sorts. It contains \
wrapper functions with the correct parameters for CRC-CCITT, CRC-16, CRC-32 \
and CRC-64, as well as the CRC used in OpenPGP's ASCII-armored checksum."
LICENSE = "SUSE-Public-Domain"

PV = "0.24"

RPM_NAME = "perl-Digest-CRC-0.24-1.4.aarch64.rpm"
RPM_HASH = "ad11aeb37d408f6067b9067a371e306315f465faed441ef23fd94ce07f5f29b0c2711a7df3e291ec2f4ecd85ec375d18fb723b0afdece7755cc4d0d3e16923c9"

RPROVIDES:${PN} += "perl(Digest::CRC) \
perl-Digest-CRC \
perl-Digest-CRC(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
