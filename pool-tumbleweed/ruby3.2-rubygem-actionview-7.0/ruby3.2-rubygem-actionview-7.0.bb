SUMMARY = "Rendering framework putting the V in MVC (part of Rails)"
DESCRIPTION = "Simple, battle-tested conventions and helpers for building web pages."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-actionview-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "32ca7ba2ee491876580ab063ce53cfafafc2e77046d974a5c37f724cc91bbeffd7fa5e9e46c509143a3f9d12e830c5aaa43abf3da26f2e18183e69f8a5dd93de"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionview-7.0 \
ruby3.2-rubygem-actionview-7.0(aarch-64) \
rubygem(actionview) \
rubygem(ruby:3.2.0:actionview) \
rubygem(ruby:3.2.0:actionview:7) \
rubygem(ruby:3.2.0:actionview:7.0) \
rubygem(ruby:3.2.0:actionview:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:builder:3) \
rubygem(ruby:3.2.0:erubi:1) \
rubygem(ruby:3.2.0:rails-dom-testing:2) \
rubygem(ruby:3.2.0:rails-html-sanitizer) \
rubygem(ruby:3.2.0:rails-html-sanitizer:1)"

inherit rpm
