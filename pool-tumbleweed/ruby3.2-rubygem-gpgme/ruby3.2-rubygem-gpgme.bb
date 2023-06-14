SUMMARY = "Ruby binding of GPGME"
DESCRIPTION = "Ruby-GPGME is a Ruby language binding of GPGME (GnuPG \
Made Easy). GnuPG Made Easy (GPGME) is a library designed to make access to \
GnuPG easier for applications. It provides a High-Level Crypto API for \
encryption, decryption, signing, signature verification and key management."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.22"

RPM_NAME = "ruby3.2-rubygem-gpgme-2.0.22-1.4.aarch64.rpm"
RPM_HASH = "13917e62476da959e1fb623b1d03e35d2943fe83e7b9f5cf51a488fb30af0b912b4e704397e758c15253f88d11539ada46e6a0f9135d721509b98482d8f42465"

RPROVIDES:${PN} += "ruby3.2-rubygem-gpgme \
rubygem-gpgme \
rubygem-ruby-3.2.0-gpgme \
rubygem-ruby-3.2.0-gpgme-2 \
rubygem-ruby-3.2.0-gpgme-2.0 \
rubygem-ruby-3.2.0-gpgme-2.0.22"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
rubygem-ruby-3.2.0-mini-portile2-2"

inherit rpm
