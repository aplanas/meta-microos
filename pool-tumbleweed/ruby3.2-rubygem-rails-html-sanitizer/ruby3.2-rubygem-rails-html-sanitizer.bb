SUMMARY = "HTML sanitization to Rails applications (part of Rails)"
DESCRIPTION = "HTML sanitization for Rails applications."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ruby3.2-rubygem-rails-html-sanitizer-1.5.0-2.1.aarch64.rpm"
RPM_HASH = "abb0d1c4d2ff6a69edcbaaf56665a5b62f493eedb9576d550742dd175c5365c41bc226b81831a5e6aaef15cd6c90880fb36347504cd4f66a5be0fa3dc9390d42"

RPROVIDES:${PN} += "ruby3.2-rubygem-rails-html-sanitizer \
rubygem-rails-html-sanitizer \
rubygem-ruby-3.2.0-rails-html-sanitizer \
rubygem-ruby-3.2.0-rails-html-sanitizer-1 \
rubygem-ruby-3.2.0-rails-html-sanitizer-1.5 \
rubygem-ruby-3.2.0-rails-html-sanitizer-1.5.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-loofah \
rubygem-ruby-3.2.0-loofah-2"

inherit rpm
