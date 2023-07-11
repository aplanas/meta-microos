SUMMARY = "Generate cryptographic signatures for objects"
DESCRIPTION = "Object::Signature is an abstract base class that you can inherit from in \
order to allow your objects to generate unique cryptographic signatures. \
 \
The method used to generate the signature is based on Storable and \
Digest::MD5. The object is fed to 'Storable::nfreeze' to get a string, \
which is then passed to Digest::MD5::md5_hex to get a unique 32 character \
hexadecimal signature."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Object-Signature-1.08-1.18.noarch.rpm"
RPM_HASH = "134ceb40d81e739c66e6bd893ce45c81a5c0f4ea3fb0b920e30254aa176e984570e8f7cab4e1cfb458d71cce17dd8e1012a63f2f34237c0e0509a0f9e6ca5738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Object--Signature \
perl-Object--Signature--File \
perl-Object-Signature"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
