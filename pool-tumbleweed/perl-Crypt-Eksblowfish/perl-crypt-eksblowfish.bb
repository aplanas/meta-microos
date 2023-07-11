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

RPM_NAME = "perl-Crypt-Eksblowfish-0.009-1.34.aarch64.rpm"
RPM_HASH = "80e28cd57329cece453fe72dbc83bbaa9d012718d821bd3213eaa38b898b9000c1c4373adda4e36a87656a7c726d04d59e5647f794efd223c704844b01c2ede0"

RPROVIDES:${PN} += "perl-Crypt--Eksblowfish \
perl-Crypt--Eksblowfish--Bcrypt \
perl-Crypt--Eksblowfish--Blowfish \
perl-Crypt--Eksblowfish--Family \
perl-Crypt--Eksblowfish--Subkeyed \
perl-Crypt--Eksblowfish--Uklblowfish \
perl-Crypt-Eksblowfish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Class--Mix \
perl-parent"

inherit rpm
