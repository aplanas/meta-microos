SUMMARY = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1"
DESCRIPTION = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1 server for \
Ruby/Rack applications. Puma is intended for use in both development and \
production environments. It's great for highly parallel Ruby implementations \
such as Rubinius and JRuby as well as as providing process worker support to \
support CRuby well."
LICENSE = "BSD-3-Clause"

PV = "5.6.5"

RPM_NAME = "ruby3.2-rubygem-puma-5-5.6.5-1.5.aarch64.rpm"
RPM_HASH = "facbacc2e61bd39d716add4a2f0bd0a14941ae848dae19d7b9e2111b0bdcfc16ed7d67af7f18e54a3c1e0bc30c62c371e29ab42e35ea86be176f47f85b57873c"

RPROVIDES:${PN} += "ruby3.2-rubygem-puma-5 \
rubygem-puma \
rubygem-ruby-3.2.0-puma \
rubygem-ruby-3.2.0-puma-5 \
rubygem-ruby-3.2.0-puma-5.6 \
rubygem-ruby-3.2.0-puma-5.6.5"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libruby3.2.so.3.2 \
libssl.so.3 \
ruby-abi \
rubygem-ruby-3.2.0-nio4r-2 \
update-alternatives"

inherit rpm
