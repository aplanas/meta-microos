SUMMARY = "A toolkit for building modeling frameworks (part of Rails)"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record. Rich support \
for attributes, callbacks, validations, serialization, internationalization, \
and testing."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-activemodel-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "72877c6c03aad9c184409be0f384f7829fef9387195cc03308a4cb08ba18c961df2858e3022be2a31da3f5012e58f8c1a55562fb500785562cdde74aa5ac3637"

RPROVIDES:${PN} += "ruby3.2-rubygem-activemodel-7.0 \
rubygem-activemodel \
rubygem-ruby-3.2.0-activemodel \
rubygem-ruby-3.2.0-activemodel-7 \
rubygem-ruby-3.2.0-activemodel-7.0 \
rubygem-ruby-3.2.0-activemodel-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activesupport"

inherit rpm
