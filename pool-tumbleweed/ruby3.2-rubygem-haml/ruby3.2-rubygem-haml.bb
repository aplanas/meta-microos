SUMMARY = "An elegant, structured (X)HTML/XML templating engine"
DESCRIPTION = "An elegant, structured (X)HTML/XML templating engine."
LICENSE = "MIT"

PV = "6.0.12"

RPM_NAME = "ruby3.2-rubygem-haml-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "de492aa34a2680fc854932fc16b2bf95ba1c15926c43b5ba779a87794018b56f1124dd596a98086c59aa619d70435053ac69b38cc09b9608c0d9e3ce43393cd4"

RPROVIDES:${PN} += "ruby3.2-rubygem-haml \
rubygem-haml \
rubygem-ruby-3.2.0-haml \
rubygem-ruby-3.2.0-haml-6 \
rubygem-ruby-3.2.0-haml-6.0 \
rubygem-ruby-3.2.0-haml-6.0.12"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
rubygem-ruby-3.2.0-temple \
rubygem-ruby-3.2.0-thor \
rubygem-ruby-3.2.0-tilt \
update-alternatives"

inherit rpm
