SUMMARY = "Parse CSS and add vendor prefixes to CSS rules using values from the"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use \
website."
LICENSE = "MIT"

PV = "10.4.7.0"

RPM_NAME = "ruby3.2-rubygem-autoprefixer-rails-10.4.7.0-1.7.aarch64.rpm"
RPM_HASH = "ae43f0c19edb0ba64a99b5244870feb5844851dbc87283794a432290af1223a69d5074352ce24ba663244b8fc201834fc6e4a0dcc9c703ec43f4f4b4a277b3cc"

RPROVIDES:${PN} += "ruby3.2-rubygem-autoprefixer-rails \
rubygem-autoprefixer-rails \
rubygem-ruby-3.2.0-autoprefixer-rails \
rubygem-ruby-3.2.0-autoprefixer-rails-10 \
rubygem-ruby-3.2.0-autoprefixer-rails-10.4 \
rubygem-ruby-3.2.0-autoprefixer-rails-10.4.7"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-execjs"

inherit rpm
