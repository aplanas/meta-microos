SUMMARY = "A toolkit of support libraries and Ruby core extensions extracted"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the \
Rails framework. Rich support for multibyte strings, internationalization, \
time zones, and testing."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-activesupport-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "9daf9205cc9e3a0a97490f79870d601bc0af4efbb3815b5c9bccc5e45eb5c23945957b9dc0db55eaf102dc6bc1551bd2bfdf8bb321c9821557c642f506165bc8"

RPROVIDES:${PN} += "ruby3.2-rubygem-activesupport-7.0 \
rubygem-activesupport \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-activesupport-7 \
rubygem-ruby-3.2.0-activesupport-7.0 \
rubygem-ruby-3.2.0-activesupport-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby \
rubygem-ruby-3.2.0-concurrent-ruby-1 \
rubygem-ruby-3.2.0-i18n \
rubygem-ruby-3.2.0-minitest \
rubygem-ruby-3.2.0-tzinfo-2"

inherit rpm
