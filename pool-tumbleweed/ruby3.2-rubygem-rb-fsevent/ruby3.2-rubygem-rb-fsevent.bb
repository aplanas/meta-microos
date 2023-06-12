SUMMARY = "Very simple & usable FSEvents API"
DESCRIPTION = "FSEvents API with Signals catching (without RubyCocoa)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "ruby3.2-rubygem-rb-fsevent-0.11.2-1.5.aarch64.rpm"
RPM_HASH = "c09a35332dc167d3deab06cc79f31ebfd86d4087485e7a18be580079bf33ce7383324f72de6a8f1ddff2ccd6a186e43f757c6c503ddf721feb0a4f820a0d2d6c"

RPROVIDES:${PN} += "ruby3.2-rubygem-rb-fsevent \
ruby3.2-rubygem-rb-fsevent(aarch-64) \
rubygem(rb-fsevent) \
rubygem(ruby:3.2.0:rb-fsevent) \
rubygem(ruby:3.2.0:rb-fsevent:0) \
rubygem(ruby:3.2.0:rb-fsevent:0.11) \
rubygem(ruby:3.2.0:rb-fsevent:0.11.2)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
