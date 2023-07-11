SUMMARY = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1"
DESCRIPTION = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1 server for \
Ruby/Rack applications. Puma is intended for use in both development and \
production environments. It's great for highly parallel Ruby implementations \
such as Rubinius and JRuby as well as as providing process worker support to \
support CRuby well."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "ruby3.2-rubygem-puma-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "b844db4ffc3aeb673549002b9408469a4df5c58b300eaea231f98f70b54f96df9ebe20254d057751c208b27da1af6e2c1a7db5ac6134b4d2e3df33c2bab1afd9"

RPROVIDES:${PN} += "ruby3.2-rubygem-puma \
rubygem-puma \
rubygem-ruby-3.2.0-puma \
rubygem-ruby-3.2.0-puma-6 \
rubygem-ruby-3.2.0-puma-6.2 \
rubygem-ruby-3.2.0-puma-6.2.2"

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
