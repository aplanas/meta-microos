SUMMARY = "Trollop is a commandline option parser for Ruby that just gets out"
DESCRIPTION = "Trollop is a commandline option parser for Ruby that just gets out of your \
way. \
**DEPRECATION** This gem has been renamed to optimist and will no longer be \
supported. Please switch to optimist as soon as possible."
LICENSE = "Ruby"

PV = "2.9.10"

RPM_NAME = "ruby3.2-rubygem-trollop-2.9.10-1.17.aarch64.rpm"
RPM_HASH = "e62bc54124132b8ea90390135402ff422d7042ef0b5a8dc5b9537b4c3d3deaa22ab253f62e0e1c47b4c421771fae53946aad42eab0f5c7316c2be2f1f18b1f8b"

RPROVIDES:${PN} += "ruby3.2-rubygem-trollop \
ruby3.2-rubygem-trollop(aarch-64) \
rubygem(ruby:3.2.0:trollop) \
rubygem(ruby:3.2.0:trollop:2) \
rubygem(ruby:3.2.0:trollop:2.9) \
rubygem(ruby:3.2.0:trollop:2.9.10) \
rubygem(trollop)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
