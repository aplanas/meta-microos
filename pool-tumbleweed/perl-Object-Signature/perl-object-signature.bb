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

RPM_NAME = "perl-Object-Signature-1.08-1.17.noarch.rpm"
RPM_HASH = "3aca19922a8fce8b30542867801ba6eced12217a2f1d825ac12d59a8045e54ed9aba294927be97482f456555793b6c10444d9d20780469d76950f82d927fe9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Object--Signature \
perl-Object--Signature--File \
perl-Object-Signature"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
