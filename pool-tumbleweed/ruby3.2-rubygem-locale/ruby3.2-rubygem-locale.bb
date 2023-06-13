SUMMARY = "Ruby-Locale is the pure ruby library which provides basic APIs for"
DESCRIPTION = "Ruby-Locale is the pure ruby library which provides basic APIs for \
localization."
LICENSE = "Ruby & LGPL-3.0-or-later"

PV = "2.1.3"

RPM_NAME = "ruby3.2-rubygem-locale-2.1.3-1.16.aarch64.rpm"
RPM_HASH = "8a8951bcc0d640d5580715df19510c381805c3308acdd69e2eb313c4ada014ecceef0f9ca9bbb5bd329592e1a6228b2f91bf1d3662c11e7efb94d87385866563"

RPROVIDES:${PN} += "ruby3.2-rubygem-locale \
ruby3.2-rubygem-locale(aarch-64) \
rubygem(locale) \
rubygem(ruby:3.2.0:locale) \
rubygem(ruby:3.2.0:locale:2) \
rubygem(ruby:3.2.0:locale:2.1) \
rubygem(ruby:3.2.0:locale:2.1.3)"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
