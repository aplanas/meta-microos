SUMMARY = "Ruby FFI bindings for llhttp"
DESCRIPTION = "Ruby FFI bindings for llhttp."
LICENSE = "MPL-2.0"

PV = "0.4.0"

RPM_NAME = "ruby3.2-rubygem-llhttp-ffi-0.4.0-1.13.aarch64.rpm"
RPM_HASH = "abe0609a069373767b5253f78d6801a2561cb2ae5fbd28e780d3f02b1db91927995ba0d215555befffeca1f5f88f466cc781bd27a345816404a0f7357ea86546"

RPROVIDES:${PN} += "libllhttp-ext.so()(64bit) \
ruby3.2-rubygem-llhttp-ffi \
ruby3.2-rubygem-llhttp-ffi(aarch-64) \
rubygem(llhttp-ffi) \
rubygem(ruby:3.2.0:llhttp-ffi) \
rubygem(ruby:3.2.0:llhttp-ffi:0) \
rubygem(ruby:3.2.0:llhttp-ffi:0.4) \
rubygem(ruby:3.2.0:llhttp-ffi:0.4.0)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
ruby(abi) \
rubygem(ruby:3.2.0:ffi-compiler:1) \
rubygem(ruby:3.2.0:rake:13)"

inherit rpm
