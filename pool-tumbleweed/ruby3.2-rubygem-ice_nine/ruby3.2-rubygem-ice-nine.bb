SUMMARY = "Deep Freeze Ruby Objects"
DESCRIPTION = "Deep Freeze Ruby Objects."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "ruby3.2-rubygem-ice_nine-0.11.2-1.30.aarch64.rpm"
RPM_HASH = "c6967a0b33a2662b2c52431470db246ff4b6edca1350942114cf413159a99c124583b30469a2ad2dc2f83c46d2c870a88f1f94605323e3a870a0193e07d0f688"

RPROVIDES:${PN} += "ruby3.2-rubygem-ice_nine \
ruby3.2-rubygem-ice_nine(aarch-64) \
rubygem(ice_nine) \
rubygem(ruby:3.2.0:ice_nine) \
rubygem(ruby:3.2.0:ice_nine:0) \
rubygem(ruby:3.2.0:ice_nine:0.11) \
rubygem(ruby:3.2.0:ice_nine:0.11.2)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
