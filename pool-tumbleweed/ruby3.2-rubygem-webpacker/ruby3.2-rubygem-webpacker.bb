SUMMARY = "Use webpack to manage app-like JavaScript modules in Rails"
DESCRIPTION = "Use webpack to manage app-like JavaScript modules in Rails."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "ruby3.2-rubygem-webpacker-5.4.3-1.9.aarch64.rpm"
RPM_HASH = "5d1308a600d58679d9726da7c7c9342f82deec6daf7a3de6650b9d457c1ddc52eadbfc6964c579f61775d1866362c1ad3280664107369b39750d3b14e853cbb7"

RPROVIDES:${PN} += "ruby3.2-rubygem-webpacker \
rubygem-ruby-3.2.0-webpacker \
rubygem-ruby-3.2.0-webpacker-5 \
rubygem-ruby-3.2.0-webpacker-5.4 \
rubygem-ruby-3.2.0-webpacker-5.4.3 \
rubygem-webpacker"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-rack-proxy \
rubygem-ruby-3.2.0-railties \
rubygem-ruby-3.2.0-semantic-range"

inherit rpm
