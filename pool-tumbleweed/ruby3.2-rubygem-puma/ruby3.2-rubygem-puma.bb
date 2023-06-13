SUMMARY = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1"
DESCRIPTION = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1 server for \
Ruby/Rack applications. Puma is intended for use in both development and \
production environments. It's great for highly parallel Ruby implementations \
such as Rubinius and JRuby as well as as providing process worker support to \
support CRuby well."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "ruby3.2-rubygem-puma-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "868a6bdb217874039f0172137be494649c8694754bcb80f889280799eaa5cf45b1fa28b8c262d1191856fb2a2f403f8f5e9466cf9c8bebfb088f89071213c48d"

RPROVIDES:${PN} += "ruby3.2-rubygem-puma \
ruby3.2-rubygem-puma(aarch-64) \
rubygem(puma) \
rubygem(ruby:3.2.0:puma) \
rubygem(ruby:3.2.0:puma:6) \
rubygem(ruby:3.2.0:puma:6.0) \
rubygem(ruby:3.2.0:puma:6.0.0)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
ruby(abi) \
rubygem(ruby:3.2.0:nio4r:2) \
update-alternatives"

inherit rpm
