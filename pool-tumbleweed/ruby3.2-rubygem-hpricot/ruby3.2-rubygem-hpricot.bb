SUMMARY = "A fast and flexible HTML Parser"
DESCRIPTION = "Hpricot is a flexible HTML parser written in C. It's designed to be similar to Tanaka Akira's HTree, and has a library. Hpricot can read broken XML files, since many of the same techniques can be used."
LICENSE = "MIT"

PV = "0.8.6"

RPM_NAME = "ruby3.2-rubygem-hpricot-0.8.6-2.30.aarch64.rpm"
RPM_HASH = "d03442899b6b3b8da891e6e00334e61dda26fa0b2c109d2737af7b871f9cc7d88382b14aa25f37d475afaa8d143c17b4494a29c0a1973f33a5387c938f049a98"

RPROVIDES:${PN} += "ruby3.2-rubygem-hpricot \
rubygem-hpricot \
rubygem-ruby-3.2.0-hpricot \
rubygem-ruby-3.2.0-hpricot-0 \
rubygem-ruby-3.2.0-hpricot-0.8 \
rubygem-ruby-3.2.0-hpricot-0.8.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
