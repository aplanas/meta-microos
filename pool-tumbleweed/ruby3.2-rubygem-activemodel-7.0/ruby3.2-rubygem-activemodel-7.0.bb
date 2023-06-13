SUMMARY = "A toolkit for building modeling frameworks (part of Rails)"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record. Rich support \
for attributes, callbacks, validations, serialization, internationalization, \
and testing."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-activemodel-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "00315a71bc9c0481adeea5f2c434d9caab84b6802f739d52234d385df01795bf8b06085911f806ab8561b71f2c6ea122a5a1da3a8e74661899e9d30cffb47916"

RPROVIDES:${PN} += "ruby3.2-rubygem-activemodel-7.0 \
ruby3.2-rubygem-activemodel-7.0(aarch-64) \
rubygem(activemodel) \
rubygem(ruby:3.2.0:activemodel) \
rubygem(ruby:3.2.0:activemodel:7) \
rubygem(ruby:3.2.0:activemodel:7.0) \
rubygem(ruby:3.2.0:activemodel:7.0.4)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activesupport)"

inherit rpm
