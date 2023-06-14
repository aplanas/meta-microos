SUMMARY = "A very snaky hash"
DESCRIPTION = "A Hashie::Mash joint to make #snakelife better."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "ruby3.2-rubygem-snaky_hash-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "627f0a3721d0c316fc8d21545f028fb61d62eaeeb65d9165883bc27a6b604f3ca9585d5dec01a275ab8bced89a0f31b3af632d63b6c35e40980c11638641541e"

RPROVIDES:${PN} += "ruby3.2-rubygem-snaky-hash \
rubygem-ruby-3.2.0-snaky-hash \
rubygem-ruby-3.2.0-snaky-hash-2 \
rubygem-ruby-3.2.0-snaky-hash-2.0 \
rubygem-ruby-3.2.0-snaky-hash-2.0.1 \
rubygem-snaky-hash"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-hashie \
rubygem-ruby-3.2.0-version-gem \
rubygem-ruby-3.2.0-version-gem-1"

inherit rpm
