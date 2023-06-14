SUMMARY = "Rails application preloader"
DESCRIPTION = "Preloads your application so things like console, rake and tests run faster."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "ruby3.2-rubygem-spring-4.1.0-1.6.aarch64.rpm"
RPM_HASH = "7e27dfafaaab47775b5a383b3c111cdc29f868a19d20cd56cd27ccbe5a6a0864e266060a84632b8a00c258dccec750d70120d3f066ec57ee08e8f5e3ca480611"

RPROVIDES:${PN} += "ruby3.2-rubygem-spring \
rubygem-ruby-3.2.0-spring \
rubygem-ruby-3.2.0-spring-4 \
rubygem-ruby-3.2.0-spring-4.1 \
rubygem-ruby-3.2.0-spring-4.1.0 \
rubygem-spring"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
update-alternatives"

inherit rpm
