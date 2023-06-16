SUMMARY = "Fast Implementation of Gruber's Markdown in C"
DESCRIPTION = "Fast Implementation of Gruber's Markdown in C."
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "ruby3.2-rubygem-rdiscount-2.2.7-1.7.aarch64.rpm"
RPM_HASH = "8bbd338c87084f9edadfcca8110bcf8469b5d8691fed9ca1bb60f27fb57cd28db3df9a9b21b869ea98e4954bdb88fc7dc102a55f3b1587c2a923c1f3649d477c"

RPROVIDES:${PN} += "ruby3.2-rubygem-rdiscount \
rubygem-rdiscount \
rubygem-ruby-3.2.0-rdiscount \
rubygem-ruby-3.2.0-rdiscount-2 \
rubygem-ruby-3.2.0-rdiscount-2.2 \
rubygem-ruby-3.2.0-rdiscount-2.2.7"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
update-alternatives"

inherit rpm
