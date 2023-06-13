SUMMARY = "let your Gemfile do the configuring"
DESCRIPTION = "Haml-rails provides Haml generators for Rails 5. It also enables Haml as the \
templating engine for you, so you don't have to screw around in your own \
application.rb when your Gemfile already clearly indicated what templating \
engine you have installed. Hurrah."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "ruby3.2-rubygem-haml-rails-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "cc0f4c63e97f78a38cb3b82a7374dd87b5d215a6f947d31260726cd28c351187ec9c2cdabfc5f7ac721b9609c275ee0d7e54b47eafc39facae43eef72dbc7a50"

RPROVIDES:${PN} += "ruby3.2-rubygem-haml-rails \
ruby3.2-rubygem-haml-rails(aarch-64) \
rubygem(haml-rails) \
rubygem(ruby:3.2.0:haml-rails) \
rubygem(ruby:3.2.0:haml-rails:2) \
rubygem(ruby:3.2.0:haml-rails:2.1) \
rubygem(ruby:3.2.0:haml-rails:2.1.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:haml) \
rubygem(ruby:3.2.0:railties)"

inherit rpm
