SUMMARY = "OpenBSD's bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based PRF)"
DESCRIPTION = "This gem implements bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based \
PRF)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-bcrypt_pbkdf-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "12c9fca226c62a4c22356c1f86e8492c4b67b1b8772a34b897c46e36463de0f86356ffe7f7ea1a0c964082aeacbc26428c36cfb72db2f50e90acb7cf65221f1d"

RPROVIDES:${PN} += "ruby3.2-rubygem-bcrypt-pbkdf \
rubygem-bcrypt-pbkdf \
rubygem-ruby-3.2.0-bcrypt-pbkdf \
rubygem-ruby-3.2.0-bcrypt-pbkdf-1 \
rubygem-ruby-3.2.0-bcrypt-pbkdf-1.1 \
rubygem-ruby-3.2.0-bcrypt-pbkdf-1.1.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
