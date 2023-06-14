SUMMARY = "A cool framework for doing high performance I/O in Ruby"
DESCRIPTION = "Cool.io provides a high performance event framework for Ruby which uses the \
libev C library."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "ruby3.2-rubygem-cool.io-1.7.1-1.13.aarch64.rpm"
RPM_HASH = "fc14a35ed98676a1c412ecf793aa3ce12936378e4adbe0b47ab4f99084af3046f566331fe7425db30428e67cff921704bab7c9024c435b1b17ac2adffee0c301"

RPROVIDES:${PN} += "ruby3.2-rubygem-cool.io \
rubygem-cool.io \
rubygem-ruby-3.2.0-cool.io \
rubygem-ruby-3.2.0-cool.io-1 \
rubygem-ruby-3.2.0-cool.io-1.7 \
rubygem-ruby-3.2.0-cool.io-1.7.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
