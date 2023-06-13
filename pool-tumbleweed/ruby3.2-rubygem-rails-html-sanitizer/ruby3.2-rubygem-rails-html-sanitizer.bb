SUMMARY = "HTML sanitization to Rails applications (part of Rails)"
DESCRIPTION = "HTML sanitization for Rails applications."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ruby3.2-rubygem-rails-html-sanitizer-1.5.0-1.2.aarch64.rpm"
RPM_HASH = "71804c2a5cb38ae608364c80041f2ed5bfcdd49167fe183ce32703b01551947db017e0f8434380834ed02a365bafa69408c6e82748260fa9aa30d70b483dd721"

RPROVIDES:${PN} += "ruby3.2-rubygem-rails-html-sanitizer \
ruby3.2-rubygem-rails-html-sanitizer(aarch-64) \
rubygem(rails-html-sanitizer) \
rubygem(ruby:3.2.0:rails-html-sanitizer) \
rubygem(ruby:3.2.0:rails-html-sanitizer:1) \
rubygem(ruby:3.2.0:rails-html-sanitizer:1.5) \
rubygem(ruby:3.2.0:rails-html-sanitizer:1.5.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:loofah) \
rubygem(ruby:3.2.0:loofah:2)"

inherit rpm
