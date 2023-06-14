SUMMARY = "New wave Internationalization support for Ruby"
DESCRIPTION = "New wave Internationalization support for Ruby."
LICENSE = "MIT"

PV = "1.12.0"

RPM_NAME = "ruby3.2-rubygem-i18n-1.12.0-1.6.aarch64.rpm"
RPM_HASH = "5f54a37aeb9138285fba10d53612dd98793df9c677a95cba17f5cf7526914fd973286c079aeb4cf98e29faca32d6df0e84bbdde9aeab7fe95a119c164d8389f0"

RPROVIDES:${PN} += "ruby3.2-rubygem-i18n \
rubygem-i18n \
rubygem-ruby-3.2.0-i18n \
rubygem-ruby-3.2.0-i18n-1 \
rubygem-ruby-3.2.0-i18n-1.12 \
rubygem-ruby-3.2.0-i18n-1.12.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby-1"

inherit rpm
