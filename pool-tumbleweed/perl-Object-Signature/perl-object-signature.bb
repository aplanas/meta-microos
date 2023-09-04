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

RPM_NAME = "perl-Object-Signature-1.08-1.19.noarch.rpm"
RPM_HASH = "f06c2ef097f2049a1c261fbcf9a87caa636c01949da501ce0a1f1987c5da91e56795e2e76613144e5dd1a899f0f5164105c06c8f421a0258c3ef3e1d2a4b152a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Object--Signature \
perl-Object--Signature--File \
perl-Object-Signature"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
