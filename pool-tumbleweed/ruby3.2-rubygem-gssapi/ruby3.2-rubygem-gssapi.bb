SUMMARY = "A FFI wrapper around the system GSSAPI library"
DESCRIPTION = "A FFI wrapper around the system GSSAPI library. Please make sure and read \
the \
Yard docs or standard GSSAPI documentation if you have any questions. \
There is also a class called GSSAPI::Simple that wraps many of the common \
features \
used for GSSAPI."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "ruby3.2-rubygem-gssapi-1.3.1-1.13.aarch64.rpm"
RPM_HASH = "d72d4883c0ae7bfcd2ab07f8f0ab87e72498b7b2daf3b901026e642ca71eaa8e9fc341e9f8cd8c8c4b0876c56c6fff9ac4849b0f49c8a19c5e0934caffac183c"

RPROVIDES:${PN} += "ruby3.2-rubygem-gssapi \
ruby3.2-rubygem-gssapi(aarch-64) \
rubygem(gssapi) \
rubygem(ruby:3.2.0:gssapi) \
rubygem(ruby:3.2.0:gssapi:1) \
rubygem(ruby:3.2.0:gssapi:1.3) \
rubygem(ruby:3.2.0:gssapi:1.3.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:ffi)"

inherit rpm
