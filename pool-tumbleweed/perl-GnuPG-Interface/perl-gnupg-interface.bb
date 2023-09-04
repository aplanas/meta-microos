SUMMARY = "Perl interface to GnuPG"
DESCRIPTION = "GnuPG::Interface and its associated modules are designed to provide an \
object-oriented method for interacting with GnuPG, being able to perform \
functions such as but not limited to encrypting, signing, decryption, \
verification, and key-listing parsing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-GnuPG-Interface-1.02-1.12.noarch.rpm"
RPM_HASH = "bda83954abd94ce75592d9c69dd691bb83cb7792c9fcb146060c6a8339f3702a903f5b6a52bd54a9eaeb957b343f707b12764619dbfb4c8bc41e64eefc686fe2"
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
perl--MODULE-COMPAT-5.38.0 \
perl-Math--BigInt \
perl-Moo \
perl-MooX--HandlesVia \
perl-MooX--late"

inherit rpm
