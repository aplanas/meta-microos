SUMMARY = "Robust streaming downloads using Net::HTTP, HTTP.rb or wget"
DESCRIPTION = "Robust streaming downloads using Net::HTTP, HTTP.rb or wget."
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "ruby3.2-rubygem-down-5.3.1-1.5.aarch64.rpm"
RPM_HASH = "a8313957aa5397d673de5e9df822df0f8c21ddcecd1c5d16a4264d8787823215026a032c0e4ddcf6e70e364c064a278b318ac289c6fa119eead4e7de85e4a8c0"

RPROVIDES:${PN} += "ruby3.2-rubygem-down \
ruby3.2-rubygem-down(aarch-64) \
rubygem(down) \
rubygem(ruby:3.2.0:down) \
rubygem(ruby:3.2.0:down:5) \
rubygem(ruby:3.2.0:down:5.3) \
rubygem(ruby:3.2.0:down:5.3.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:addressable:2)"

inherit rpm
