SUMMARY = "Rack-based asset packaging system"
DESCRIPTION = "Sprockets is a Rack-based asset packaging system that concatenates and serves \
JavaScript, CoffeeScript, CSS, Sass, and SCSS."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "ruby3.2-rubygem-sprockets-4.1.1-1.7.aarch64.rpm"
RPM_HASH = "36a4d4bae149c49201dddcc8ec0ef06db03df0dd1bcf2aeb05c7f830a23c3d718488802df83d468b476e1d01876b21afa57699d603e3b8693662d5c0f216f9e7"

RPROVIDES:${PN} += "ruby3.2-rubygem-sprockets \
rubygem-ruby-3.2.0-sprockets \
rubygem-ruby-3.2.0-sprockets-4 \
rubygem-ruby-3.2.0-sprockets-4.1 \
rubygem-ruby-3.2.0-sprockets-4.1.1 \
rubygem-sprockets"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby-1 \
rubygem-ruby-3.2.0-rack \
update-alternatives"

inherit rpm
