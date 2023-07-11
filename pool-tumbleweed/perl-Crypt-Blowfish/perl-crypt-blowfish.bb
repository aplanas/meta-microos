SUMMARY = "Perl Blowfish encryption module"
DESCRIPTION = "Blowfish is capable of strong encryption and can use key sizes up to 56 \
bytes (a 448 bit key). You're encouraged to take advantage of the full key \
size to ensure the strongest encryption possible from this module."
LICENSE = "BSD-3-Clause"

PV = "2.14"

RPM_NAME = "perl-Crypt-Blowfish-2.14-5.37.aarch64.rpm"
RPM_HASH = "fdc99df4874bfc2ce098fc6eca792c9a66f766deac3b7ce72d53886e7ce4458507716f1f45141d6697e08d3f28f9454af3c905e3b8526236d43363bd874a6935"

RPROVIDES:${PN} += "perl-Crypt--Blowfish \
perl-Crypt-Blowfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
