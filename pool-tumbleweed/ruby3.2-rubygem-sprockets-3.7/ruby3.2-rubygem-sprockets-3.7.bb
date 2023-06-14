SUMMARY = "Rack-based asset packaging system"
DESCRIPTION = "Sprockets is a Rack-based asset packaging system that concatenates and serves \
JavaScript, CoffeeScript, CSS, LESS, Sass, and SCSS."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "ruby3.2-rubygem-sprockets-3.7-3.7.2-1.19.aarch64.rpm"
RPM_HASH = "a1d21d548332e7d84bb3b91c4123e64b9e8ccf24188eaadcca8886c0e9bcfec1299e146a43dc2b4911ae2e7cbb8b73bce66ebbff4612c01382db11577cee1292"

RPROVIDES:${PN} += "ruby3.2-rubygem-sprockets-3.7 \
rubygem-ruby-3.2.0-sprockets \
rubygem-ruby-3.2.0-sprockets-3 \
rubygem-ruby-3.2.0-sprockets-3.7 \
rubygem-ruby-3.2.0-sprockets-3.7.2 \
rubygem-sprockets"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby-1 \
rubygem-ruby-3.2.0-rack \
update-alternatives"

inherit rpm
