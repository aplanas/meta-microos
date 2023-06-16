SUMMARY = "The best way to manage your application's dependencies"
DESCRIPTION = "Bundler manages an application's dependencies through its entire life, across \
many machines, systematically and repeatably."
LICENSE = "MIT"

PV = "2.3.26"

RPM_NAME = "ruby3.2-rubygem-bundler-2.3.26-1.4.aarch64.rpm"
RPM_HASH = "99c90185f352562de990b53368990b0c76445098b5326ae48828af87efbbfe731420b2cd64c99e6ba316a084c74e00dce0907c4014cfa237f68ef8e995d9278c"

RPROVIDES:${PN} += "ruby3.2-rubygem-bundler \
rubygem-bundler \
rubygem-ruby-3.2.0-bundler \
rubygem-ruby-3.2.0-bundler-2 \
rubygem-ruby-3.2.0-bundler-2.3 \
rubygem-ruby-3.2.0-bundler-2.3.26"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
