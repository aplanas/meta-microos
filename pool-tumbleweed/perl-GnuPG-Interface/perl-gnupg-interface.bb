SUMMARY = "Perl interface to GnuPG"
DESCRIPTION = "GnuPG::Interface and its associated modules are designed to provide an \
object-oriented method for interacting with GnuPG, being able to perform \
functions such as but not limited to encrypting, signing, decryption, \
verification, and key-listing parsing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-GnuPG-Interface-1.02-1.11.noarch.rpm"
RPM_HASH = "5b79ab6508862b33fa889e7b2f656fed745f8657b7683e5bba59c00f4101cf3b92b26fbd0869bc02989de9b3f44adddfe49f7a71490fd84ac388cb74fe8fba3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GnuPG--Fingerprint \
perl-GnuPG--Handles \
perl-GnuPG--HashInit \
perl-GnuPG--Interface \
perl-GnuPG--Key \
perl-GnuPG--Options \
perl-GnuPG--PrimaryKey \
perl-GnuPG--PublicKey \
perl-GnuPG--Revoker \
perl-GnuPG--SecretKey \
perl-GnuPG--Signature \
perl-GnuPG--SubKey \
perl-GnuPG--UserAttribute \
perl-GnuPG--UserId \
perl-GnuPG-Interface"

RDEPENDS:${PN} += "gpg2 \
perl--MODULE-COMPAT-5.36.1 \
perl-Math--BigInt \
perl-Moo \
perl-MooX--HandlesVia \
perl-MooX--late"

inherit rpm
