SUMMARY = "A Ruby wrapper for BSD's kqueue, using FFI"
DESCRIPTION = "A Ruby wrapper for BSD's kqueue, using FFI."
LICENSE = "MIT"

PV = "0.2.8"

RPM_NAME = "ruby3.2-rubygem-rb-kqueue-0.2.8-1.9.aarch64.rpm"
RPM_HASH = "f7881abacd356402bd02b7cfe683af4988073efb8f8115925075a3baaf47c540af5509f5eb6654df4638458294ed1d42cc8347f3e00df99aceba249b5920aa48"

RPROVIDES:${PN} += "ruby3.2-rubygem-rb-kqueue \
rubygem-rb-kqueue \
rubygem-ruby-3.2.0-rb-kqueue \
rubygem-ruby-3.2.0-rb-kqueue-0 \
rubygem-ruby-3.2.0-rb-kqueue-0.2 \
rubygem-ruby-3.2.0-rb-kqueue-0.2.8"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-ffi"

inherit rpm
