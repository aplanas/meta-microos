SUMMARY = "Sass adapter for the Rails asset pipeline"
DESCRIPTION = "Sass adapter for the Rails asset pipeline."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "ruby3.2-rubygem-sass-rails-5.1-5.1.0-1.17.aarch64.rpm"
RPM_HASH = "6b5904d479624846487bce6e2d4a9ee94de4c5adbc45002d6c8299890c70d9e36134f46b24d32e1f82e291a6766cacb1dfaeeac41bba31111f620db540e540d0"

RPROVIDES:${PN} += "ruby3.2-rubygem-sass-rails-5.1 \
rubygem-ruby-3.2.0-sass-rails \
rubygem-ruby-3.2.0-sass-rails-5 \
rubygem-ruby-3.2.0-sass-rails-5.1 \
rubygem-ruby-3.2.0-sass-rails-5.1.0 \
rubygem-sass-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-railties \
rubygem-ruby-3.2.0-sass-3 \
rubygem-ruby-3.2.0-sprockets \
rubygem-ruby-3.2.0-sprockets-rails \
rubygem-ruby-3.2.0-tilt"

inherit rpm
