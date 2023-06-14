SUMMARY = "A Ruby implementation of AES Key Wrap, a.k.a RFC 3394, a.k.a NIST"
DESCRIPTION = "A Ruby implementation of AES Key Wrap, a.k.a RFC 3394, a.k.a NIST Key Wrap."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-aes_key_wrap-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "3c7bf83eaa9eb3571396fe7c1eab42cf377f21a43d1e887df162159fb6205576170f81b87bf13fdf6f64e2546372f20ecb5b6b86c4d580184a4113eb78e98243"

RPROVIDES:${PN} += "ruby3.2-rubygem-aes-key-wrap \
rubygem-aes-key-wrap \
rubygem-ruby-3.2.0-aes-key-wrap \
rubygem-ruby-3.2.0-aes-key-wrap-1 \
rubygem-ruby-3.2.0-aes-key-wrap-1.1 \
rubygem-ruby-3.2.0-aes-key-wrap-1.1.0"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/ruby.ruby3.2 \
ruby-abi"

inherit rpm
