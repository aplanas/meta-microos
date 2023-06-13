SUMMARY = "Perl Blowfish encryption module"
DESCRIPTION = "Blowfish is capable of strong encryption and can use key sizes up to 56 \
bytes (a 448 bit key). You're encouraged to take advantage of the full key \
size to ensure the strongest encryption possible from this module."
LICENSE = "BSD-3-Clause"

PV = "2.14"

RPM_NAME = "perl-Crypt-Blowfish-2.14-5.36.aarch64.rpm"
RPM_HASH = "f68389dd810dfe8b0fc8c0a7395ad7a629563fde4b95cb7a441cd26a921aff33d248b138652a12d298d346756d6c0c41a1d957668158a4ec2aec9371bb214b67"

RPROVIDES:${PN} += "perl(Crypt::Blowfish) \
perl-Crypt-Blowfish \
perl-Crypt-Blowfish(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
