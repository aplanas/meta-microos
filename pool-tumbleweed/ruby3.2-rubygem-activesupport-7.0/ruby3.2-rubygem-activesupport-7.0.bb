SUMMARY = "A toolkit of support libraries and Ruby core extensions extracted"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the \
Rails framework. Rich support for multibyte strings, internationalization, \
time zones, and testing."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-activesupport-7.0-7.0.4.3-2.1.aarch64.rpm"
RPM_HASH = "69e31c8bd9d1d145fd29aeed1dfcf3020a0cf0f453ec5efcaffa5f5ca134ef7e9ac14f160c7e5fe200f58d01fc1f5b2aaa7292998c2edff31dd6c91b363a8ee4"

RPROVIDES:${PN} += "ruby3.2-rubygem-activesupport-7.0 \
rubygem-activesupport \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-activesupport-7 \
rubygem-ruby-3.2.0-activesupport-7.0 \
rubygem-ruby-3.2.0-activesupport-7.0.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby \
rubygem-ruby-3.2.0-concurrent-ruby-1 \
rubygem-ruby-3.2.0-i18n \
rubygem-ruby-3.2.0-minitest \
rubygem-ruby-3.2.0-tzinfo-2"

inherit rpm
