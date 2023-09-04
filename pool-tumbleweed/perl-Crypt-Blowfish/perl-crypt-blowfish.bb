SUMMARY = "Perl Blowfish encryption module"
DESCRIPTION = "Blowfish is capable of strong encryption and can use key sizes up to 56 \
bytes (a 448 bit key). You're encouraged to take advantage of the full key \
size to ensure the strongest encryption possible from this module."
LICENSE = "BSD-3-Clause"

PV = "2.14"

RPM_NAME = "perl-Crypt-Blowfish-2.14-5.38.aarch64.rpm"
RPM_HASH = "24c38aa7ddc22061a3f466a0f86c48d32bb77a23fb6f13f4411183d403f9090f5def054a9bd054b9c68263e35119e7fb603a034b67576178e9b90c9c06c24097"

RPROVIDES:${PN} += "perl-Crypt--Blowfish \
perl-Crypt-Blowfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
