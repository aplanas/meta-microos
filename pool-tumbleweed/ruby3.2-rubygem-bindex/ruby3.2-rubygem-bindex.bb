SUMMARY = "Bindings for your Ruby exceptions"
DESCRIPTION = "Bindings for your Ruby exceptions."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "ruby3.2-rubygem-bindex-0.8.1-1.23.aarch64.rpm"
RPM_HASH = "8df86c40d799a424004c647876d96355cfbfe89e45d77e95dc2c5805ae35fc99731f76fab79c24aab28c377b0089119188e8d0e5b90112f299456f899f12bb91"

RPROVIDES:${PN} += "ruby3.2-rubygem-bindex \
rubygem-bindex \
rubygem-ruby-3.2.0-bindex \
rubygem-ruby-3.2.0-bindex-0 \
rubygem-ruby-3.2.0-bindex-0.8 \
rubygem-ruby-3.2.0-bindex-0.8.1"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
