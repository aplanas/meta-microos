SUMMARY = "Ruby C bindings to the excellent Yajl JSON stream-based parser"
DESCRIPTION = "Ruby C bindings to the excellent Yajl JSON stream-based parser library."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.3"

RPM_NAME = "ruby3.2-rubygem-yajl-ruby-1.4.3-1.6.aarch64.rpm"
RPM_HASH = "34031270f070af064495a32b396c214221a143f87052911c9ecf0db3f38179e19935da524057553c9bc689746056e76d73f3999d89fea17fd11608e860a4d8e5"

RPROVIDES:${PN} += "ruby3.2-rubygem-yajl-ruby \
rubygem-ruby-3.2.0-yajl-ruby \
rubygem-ruby-3.2.0-yajl-ruby-1 \
rubygem-ruby-3.2.0-yajl-ruby-1.4 \
rubygem-ruby-3.2.0-yajl-ruby-1.4.3 \
rubygem-yajl-ruby"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
