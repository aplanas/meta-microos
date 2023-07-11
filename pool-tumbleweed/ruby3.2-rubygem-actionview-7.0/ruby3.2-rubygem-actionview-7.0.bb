SUMMARY = "Rendering framework putting the V in MVC (part of Rails)"
DESCRIPTION = "Simple, battle-tested conventions and helpers for building web pages."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-actionview-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "200595762367b8b1594aed7b477884156b38002bf0e7248b99ecdadb4584815f9247412e5d5fa061d0edb94b6199f0ecfc56b2ad99b7e28fee940c0fb78087b1"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionview-7.0 \
rubygem-actionview \
rubygem-ruby-3.2.0-actionview \
rubygem-ruby-3.2.0-actionview-7 \
rubygem-ruby-3.2.0-actionview-7.0 \
rubygem-ruby-3.2.0-actionview-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-builder-3 \
rubygem-ruby-3.2.0-erubi-1 \
rubygem-ruby-3.2.0-rails-dom-testing-2 \
rubygem-ruby-3.2.0-rails-html-sanitizer \
rubygem-ruby-3.2.0-rails-html-sanitizer-1"

inherit rpm
