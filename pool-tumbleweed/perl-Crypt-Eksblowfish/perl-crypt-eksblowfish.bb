SUMMARY = "The Eksblowfish Block Cipher"
DESCRIPTION = "An object of this type encapsulates a keyed instance of the Eksblowfish \
block cipher, ready to encrypt and decrypt. \
 \
Eksblowfish is a variant of the Blowfish cipher, modified to make the key \
setup very expensive. ('Eks' stands for 'expensive key schedule'.) This \
doesn't make it significantly cryptographically stronger, but is intended \
to hinder brute-force attacks. It also makes it unsuitable for any \
application requiring key agility. It was designed by Niels Provos and \
David Mazieres for password hashing in OpenBSD. See the \
Crypt::Eksblowfish::Bcrypt manpage for the hash algorithm. See the \
Crypt::Eksblowfish::Blowfish manpage for the unmodified Blowfish cipher. \
 \
Eksblowfish is a parameterised (family-keyed) cipher. It takes a cost \
parameter that controls how expensive the key scheduling is. It also takes \
a family key, known as the 'salt'. Cost and salt parameters together define \
a cipher family. Within each family, a key determines an encryption \
function in the usual way. See the Crypt::Eksblowfish::Family manpage for a \
way to encapsulate an Eksblowfish cipher family."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Crypt-Eksblowfish-0.009-1.33.aarch64.rpm"
RPM_HASH = "4a5055b69129f7384fa43c89ee4d8ec956f494033a33bc14b7b1b85c5bafdc8442fc6a9e356e79907279bce43d5db6ad9d40c0d94ccc3d960a3b9d1dfd8909af"

RPROVIDES:${PN} += "perl-Crypt--Eksblowfish \
perl-Crypt--Eksblowfish--Bcrypt \
perl-Crypt--Eksblowfish--Blowfish \
perl-Crypt--Eksblowfish--Family \
perl-Crypt--Eksblowfish--Subkeyed \
perl-Crypt--Eksblowfish--Uklblowfish \
perl-Crypt-Eksblowfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-Class--Mix \
perl-parent"

inherit rpm
