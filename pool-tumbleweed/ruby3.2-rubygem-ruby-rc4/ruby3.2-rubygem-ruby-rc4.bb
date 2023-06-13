SUMMARY = "RubyRC4 is a pure Ruby implementation of the RC4 algorithm"
DESCRIPTION = "RubyRC4 is a pure Ruby implementation of the RC4 algorithm."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "ruby3.2-rubygem-ruby-rc4-0.1.5-1.15.aarch64.rpm"
RPM_HASH = "ff0466cea3a5825704def117bad1116fe0f98c679c25ee37309cbc5f0e53da661c758730319529c0189ca957427aa5056820f7b84574e49890b1582cf9c249dc"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby-rc4 \
ruby3.2-rubygem-ruby-rc4(aarch-64) \
rubygem(ruby-rc4) \
rubygem(ruby:3.2.0:ruby-rc4) \
rubygem(ruby:3.2.0:ruby-rc4:0) \
rubygem(ruby:3.2.0:ruby-rc4:0.1) \
rubygem(ruby:3.2.0:ruby-rc4:0.1.5)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
