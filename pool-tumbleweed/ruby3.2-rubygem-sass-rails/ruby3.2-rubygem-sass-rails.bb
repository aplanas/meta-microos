SUMMARY = "Sass adapter for the Rails asset pipeline"
DESCRIPTION = "Sass adapter for the Rails asset pipeline."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "ruby3.2-rubygem-sass-rails-6.0.0-1.17.aarch64.rpm"
RPM_HASH = "37235e94be013f891533a14e762d9a762ed4c5c298ed22652aef19880d6ef28154d65f8797b216355d1614394cda91d25b9ae814eb84772b851af92409c59759"

RPROVIDES:${PN} += "ruby3.2-rubygem-sass-rails \
rubygem-ruby-3.2.0-sass-rails \
rubygem-ruby-3.2.0-sass-rails-6 \
rubygem-ruby-3.2.0-sass-rails-6.0 \
rubygem-ruby-3.2.0-sass-rails-6.0.0 \
rubygem-sass-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-sassc-rails \
rubygem-ruby-3.2.0-sassc-rails-2"

inherit rpm
