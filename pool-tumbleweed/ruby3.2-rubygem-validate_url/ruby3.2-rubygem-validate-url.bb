SUMMARY = "Library for validating urls in Rails"
DESCRIPTION = "Library for validating urls in Rails."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "ruby3.2-rubygem-validate_url-1.0.15-1.5.aarch64.rpm"
RPM_HASH = "b590bd9cb085087480189c8d4005d7ab87cf5898b1d05e1556beb16332d00335bad2c14f5752c1591a271da9408daf1c8c1a67934cb443a3b1d283823f705eda"

RPROVIDES:${PN} += "ruby3.2-rubygem-validate-url \
rubygem-ruby-3.2.0-validate-url \
rubygem-ruby-3.2.0-validate-url-1 \
rubygem-ruby-3.2.0-validate-url-1.0 \
rubygem-ruby-3.2.0-validate-url-1.0.15 \
rubygem-validate-url"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activemodel \
rubygem-ruby-3.2.0-public-suffix"

inherit rpm
