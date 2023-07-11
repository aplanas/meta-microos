SUMMARY = "Web-flow and rendering framework putting the VC in MVC (part of"
DESCRIPTION = "Web apps on Rails. Simple, battle-tested conventions for building and testing \
MVC web applications. Works with any Rack-compatible server."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-actionpack-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "486169823f728e70e55c756364040b52e4fc7618509c8763f960d573fc7724dc0d41572763b2cd5562545c8aae9f8b30e7883b20080512717f1f802530e5d991"

RPROVIDES:${PN} += "ruby3.2-rubygem-actionpack-7.0 \
rubygem-actionpack \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-actionpack-7 \
rubygem-ruby-3.2.0-actionpack-7.0 \
rubygem-ruby-3.2.0-actionpack-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionview \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-rack \
rubygem-ruby-3.2.0-rack-2 \
rubygem-ruby-3.2.0-rack-test \
rubygem-ruby-3.2.0-rails-dom-testing-2 \
rubygem-ruby-3.2.0-rails-html-sanitizer \
rubygem-ruby-3.2.0-rails-html-sanitizer-1"

inherit rpm
