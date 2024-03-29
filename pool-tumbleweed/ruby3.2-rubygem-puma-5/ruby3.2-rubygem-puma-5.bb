SUMMARY = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1"
DESCRIPTION = "Puma is a simple, fast, threaded, and highly parallel HTTP 1.1 server for \
Ruby/Rack applications. Puma is intended for use in both development and \
production environments. It's great for highly parallel Ruby implementations \
such as Rubinius and JRuby as well as as providing process worker support to \
support CRuby well."
LICENSE = "BSD-3-Clause"

PV = "5.6.5"

RPM_NAME = "ruby3.2-rubygem-puma-5-5.6.5-1.6.aarch64.rpm"
RPM_HASH = "dd2795bdf215fa4d8aa02907e9cdaf3bb479e402c32f124159559e4c3c8f975a6bfa7431f463789c31952fe678aade9044b66cfe0f7443d285856614800f1d4d"

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
