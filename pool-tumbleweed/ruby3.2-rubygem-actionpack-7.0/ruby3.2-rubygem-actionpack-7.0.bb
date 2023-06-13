SUMMARY = "Web-flow and rendering framework putting the VC in MVC (part of"
DESCRIPTION = "Web apps on Rails. Simple, battle-tested conventions for building and testing \
MVC web applications. Works with any Rack-compatible server."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-actionpack-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "86ace1713983bf9f60207160e9531637c428f78e338c992f8b78ac5eb81ae326ab299381ccddb9d39247ab682dcad4c674e4f88b9fcfebefa385e3e71ca2464e"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionpack-7.0 \
ruby3.2-rubygem-actionpack-7.0(aarch-64) \
rubygem(actionpack) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:actionpack:7) \
rubygem(ruby:3.2.0:actionpack:7.0) \
rubygem(ruby:3.2.0:actionpack:7.0.4)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionview) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:rack) \
rubygem(ruby:3.2.0:rack-test) \
rubygem(ruby:3.2.0:rack:2) \
rubygem(ruby:3.2.0:rails-dom-testing:2) \
rubygem(ruby:3.2.0:rails-html-sanitizer) \
rubygem(ruby:3.2.0:rails-html-sanitizer:1)"

inherit rpm
